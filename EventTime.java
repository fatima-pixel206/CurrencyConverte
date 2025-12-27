

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTime  extends JFrame implements ActionListener {
    private JButton convert;
    private JButton exit;
    private JButton back;
    private JTextField field;
    private JTextField field2;
    private JTextField field3;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;

    public EventTime() {

        // Frame setup
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        //  setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(0x8FABD4));
        setLayout(new FlowLayout(FlowLayout.CENTER, 37, 20));

        // Labels and fields (use columns instead of setSize)
        label = new JLabel("FromCurrency");
        label.setFont(new Font("Roboto", Font.BOLD, 18));
        label.setForeground(new Color(0x060771));


        field = new JTextField(12);
        field.setFont(new Font("Roboto", Font.BOLD, 20));
        field.setForeground(new Color(0x060771));

        label2 = new JLabel("ToCurrency");
        label2.setFont(new Font("Roboto", Font.BOLD, 18));
        label2.setForeground(new Color(0x060771));


        field2 = new JTextField(12);
        field2.setFont(new Font("Roboto", Font.BOLD, 20));
        field2.setForeground(new Color(0x060771));
        //  field2.setEditable(false); // output only
//
        label3=new JLabel("AMOUNT");
        label3.setFont(new Font("Roboto", Font.BOLD, 18));
        label3.setForeground(new Color(0x060771));

        field3= new JTextField(12);
        field3.setFont(new Font("Roboto", Font.BOLD, 20));
        field3.setForeground(new Color(0x060771));
        //   field3.setEditable(false); // output only

        // Buttons as instance fields so actionPerformed can access them
        convert = new JButton("CONVERT");
        convert.setBackground(new Color(0x060771));
        convert.setForeground(new Color(0x8FABD4));
        convert.addActionListener(this);

        exit = new JButton("EXIT");
        exit.setBackground(new Color(0x060771));
        exit.setForeground(new Color(0x8FABD4));
        exit.addActionListener(this);

        back = new JButton("BACk");
        back.setBackground(new Color(0x060771));
        back.setForeground(new Color(0x8FABD4));
        back.addActionListener(this);

        // Add components
        add(label);
        add(field);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(convert);
        add(exit);
        add(back);
        // Show the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            double amount = Double.parseDouble(field3.getText());
            MianConverter converter = new MianConverter();
            double result= converter.finalConverter(field.getText().trim(),field2.getText().trim(),  amount);
            if(result!=-1) {
                JOptionPane.showMessageDialog(convert, " final amount is \n " + converter.finalConverter(field.getText().trim(), field2.getText().trim(), amount));
                //double result= converter.finalConverter(field2.getText(),field.getText(),amount);
            }
            else {
                JOptionPane.showMessageDialog(convert," enter valid curreiecs ");
            }
            // JOptionPane.showMessageDialog(convert," your final amount is in  "+field2.getText()+amount);
        } else if (e.getSource() == exit) {
            field.setText("");
            field2.setText("");
            field3.setText("");
        } else if (e.getSource() == back) {
            System.exit(0);
        }
    }

    public static void main (String[]args){
        // Ensure GUI is created on the Event Dispatch Thread
        new EventTime();
    }
}


