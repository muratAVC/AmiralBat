package Amirall;

import javax.swing.*;

public class AmiralPen {
    JFrame frame;
    AmiralPen(){
        frame=new JFrame("Amiral Battı");
        JButton button=new JButton("Atış Yap");
        frame.setSize(350,526);
        JTextField textField=new JTextField();
        JTextField textField1=new JTextField();
        JLabel label=new JLabel("Enter Rov");
        JLabel label1=new JLabel("Enter Column");
        label.setBounds(5,20,50,20);
        textField.setBounds(10,20,50,17);

        label1.setBounds(50,10,50,20);
        textField1.setBounds(60,20,50,17);

        button.setBounds(110,20,100,19);

        frame.add(button);
        frame.add(textField);
        frame.add(textField1);
        frame.add(label1);
        frame.add(label);



        frame.setLayout(null);
        frame.setVisible(true);
    }
}
