// currcny panal claas

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class CurrencyInfoPanel extends JPanel  {

    public CurrencyInfoPanel() {
        Border border=BorderFactory.createLineBorder(Color.BLUE,4);// class of border with static methods

        setLayout(new GridLayout(0, 3, 10, 10)); // rows adjust automatically
        setBackground(new Color(0x8FABD4));

        String[][] data = {
                {"United States", "USD - Dollar", "1.00"},
                {"Pakistan", "PKR - Rupee", "278.50"},
                {"United Kingdom", "GBP - Pound", "1.73"},
                {"India", "INR - Rupee", "83.20"},
                {"China", "CNY - Yuan", "7.25"},
                {"Japan", "JPY - Yen", "152.80"},
                {"Australia", "AUD - Dollar", "1.53"},
                {"Canada", "CAD - Dollar", "1.36"},
                {"Saudi Arabia", "SAR - Riyal", "3.75"},
                {"Turkey", "TRY - Lira", "34.50"},
                {"Russia", "RUB - Ruble", "92.30"},
                {"South Korea", "KRW - Won", "1350.20"},
                {"Malaysia", "MYR - Ringgit", "4.70"},
                {"Bangladesh", "BDT - Taka", "117.80"},
                {"Nepal", "NPR - Rupee", "133.00"},
                {"Singapore", "SGD - Dollar", "1.35"},
                {"South Africa", "ZAR - Rand", "18.90"},
                {"United Arab Emirates", "AED - Dirham", "3.67"},
                {"Switzerland", "CHF - Franc", "0.91"},
                {"Egypt", "EGP - Pound", "48.60"},
                {"Indonesia", "IDR - Rupiah", "15600.00"},
                {"Brazil", "BRL - Real", "5.61"},
                {"Qatar", "QAR - Riyal", "3.64"},
                {"Kuwait", "KWD - Dinar", "0.31"},
                {"Oman", "OMR - Rial", "0.38"},
                {"Bahrain", "BHD - Dinar", "0.38"},
                {"Vietnam", "VND - Dong", "24600.00"},
                {"Thailand", "THB - Baht", "36.20"},
                {"Norway", "NOK - Krone", "10.90"},
                {"Sweden", "SEK - Krona", "10.60"},
                {"Denmark", "DKK - Krone", "6.95"},
                {"Philippines", "PHP - Peso", "56.20"},
                {"Iran", "IRR - Rial", "42000.00"},
                {"Iraq", "IQD - Dinar", "1310.00"},
                {"Afghanistan", "AFN - Afghani", "71.00"},
                {"Sri Lanka", "LKR - Rupee", "303.50"},
                {"Myanmar", "MMK - Kyat", "2100.00"},
                {"New Zealand", "NZD - Dollar", "1.62"},
                {"Hong Kong", "HKD - Dollar", "7.83"},
                {"Mexico", "MXN - Peso", "17.20"},
                {"Argentina", "ARS - Peso", "876.00"},
                {"Nigeria", "NGN - Naira", "1570.00"},
                {"Kenya", "KES - Shilling", "131.00"},
                {"Ghana", "GHS - Cedi", "15.20"},
                {"Morocco", "MAD - Dirham", "9.94"},
                {"Israel", "ILS - Shekel", "3.73"},
                {"Jordan", "JOD - Dinar", "0.71"},
                {"Lebanon", "LBP - Pound", "89500.00"},
        };

        Font font = new Font("Roboto", Font.BOLD, 20);
        Font font2 = new Font("Roboto", Font.BOLD, 24);
        Font font3 = new Font("Roboto", Font.BOLD, 18);


        Color textColor = new Color(0x060771);

        for (String[] country : data) {
            JPanel itemPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            itemPanel.setBackground(new Color(0x8FABD4));

            JLabel flagLabel = new JLabel(new ImageIcon("flags/" + country[0] + ".png")); // flag image path
            JLabel nameLabel = new JLabel(country[0]);
            JLabel currencyLabel = new JLabel(country[1]);
            JLabel rates = new JLabel(" | Rate: " + country[2]);

            nameLabel.setFont(font3);
            currencyLabel.setFont(font2);
            rates.setFont(font2);
            nameLabel.setForeground(textColor);
            currencyLabel.setForeground(textColor);
            rates.setForeground(new Color(0x060771));
            JPanel container=new JPanel( new GridLayout(0,2,20,20));
            itemPanel.setPreferredSize(new Dimension(450,80));
            JScrollPane scrollPane =new JScrollPane(container);// changes height

            itemPanel.add(flagLabel);
            itemPanel.add(nameLabel);
            itemPanel.add(currencyLabel);
            itemPanel.add(rates);
            itemPanel.add(scrollPane);
            add(itemPanel);
        }
        // divded panels

        for (String[] country : data) {

            JPanel itemPanel = new JPanel();
            itemPanel.setPreferredSize(new Dimension(150,60));
            itemPanel.setBackground(new Color(0x060771));
            JLabel label=new JLabel();
            JLabel label2=new JLabel();

            String currencyName = country[0];
            String currencyCode = country[1];
            double rate = Double.parseDouble(country[2]);
            label.setText(currencyName);
            label.setFont(font);
            label2.setText(currencyCode);
            label2.setFont(font);
            JButton nextBtn = new JButton("Next");

            nextBtn.setBackground(new Color(0x8FABD4));
            label.setForeground(new Color(0x8FABD4));
            label2.setForeground(new Color(0x8FABD4));
            label.setHorizontalAlignment(JLabel.CENTER);
            label2.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            label2.setVerticalAlignment(JLabel.CENTER);
            itemPanel.setLayout(new GridLayout(2,0));
            nextBtn.setFont(new Font("Roboto",Font.BOLD,16));
            nextBtn.setForeground(textColor);
            // Add listener
            nextBtn.addActionListener( e -> {

                if (e.getSource() == nextBtn) {
                    EventTime action=new EventTime();
                    JButton Object = null;
                    // action.actionPerformed( null);
                }
            });

            itemPanel.add(label);
            itemPanel.add(label2);
            itemPanel.add(nextBtn);
            add(itemPanel);
        }
    }
}
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Currency Converter Info");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(900, 700);
//        frame.add(new JScrollPane(new CurrencyInfoPanel()));
//        frame.setVisible(true);
//    }
//}