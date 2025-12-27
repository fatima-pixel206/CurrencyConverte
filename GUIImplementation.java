import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

    public class GUIImplementation {
        public static void main(String[] args) {
            ImageIcon icon = new ImageIcon(Objects.requireNonNull(GUIImplementation.class.getResource("MainIcon.jpg")));
            Image img = icon.getImage();
            Image scaled = img.getScaledInstance(90, 80, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);
            JFrame frame = new JFrame("CURRENCY CONVERTER");
            // frame.setTitle(" ");
            frame.setForeground(new Color(0x060771));
            JLabel label = new JLabel(icon);
            //label 2

            label.setIcon(icon);
            label.setBounds(500, 500, 500, 50);
            //label.getIcon();
            Font font = new Font("Roboto", Font.BOLD, 70); // object created of font
            // using underline

            Map<TextAttribute, Object> attri = new HashMap<>(font.getAttributes());// font ki sari attributes font.getAttribute
            // k through hashMAp me ek map
            // ki surat me copy hojaye gy or us methid me hum apni trf sy attributes add krain
            attri.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);// keys and colons new pairs
            label.setFont(font.deriveFont(attri)); // ek naya font style driver ko call karain gy
            label.setForeground(new Color(0x060771));
            label.setText(" WELCOME TO CURRENCY CONVERTER");
            JLabel label2 = new JLabel();
            label2.setForeground(new Color(0x060771));

            label2.setText(" WE CONVERT THESE CURRENCIES ");
            label2.setFont(font.deriveFont(attri));
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setHorizontalAlignment(JLabel.LEFT);
//        label2.setVerticalAlignment(JLabel.TOP);
            label2.setHorizontalAlignment(JLabel.CENTER);
            frame.setSize(1000, 900);
            frame.getContentPane().setBackground(new Color(0x8FABD4));
//frame.setLayout(new BorderLayout());
            frame.setIconImage(icon.getImage());
            // panels
            JPanel topPanel = new JPanel(new GridLayout(2, 1));
            topPanel.setBackground(new Color(0x8FABD4));
            topPanel.add(label);
            topPanel.add(label2);

            // Currency info panel with scroll
            CurrencyInfoPanel currencyPanel = new CurrencyInfoPanel();
            JScrollPane scroll = new JScrollPane(currencyPanel);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scroll.getVerticalScrollBar().setUnitIncrement(16);
            scroll.setBorder(null);

            // Add everything
            frame.add(topPanel, BorderLayout.NORTH);
            frame.add(scroll, BorderLayout.CENTER);

            // Show
            frame.setVisible(true);

        }
    }


