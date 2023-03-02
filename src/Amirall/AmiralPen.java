package Amirall;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
        label.setBounds(10,5,60,20);
        textField.setBounds(10,23,60,17);

        label1.setBounds(70,5,70,20);
        textField1.setBounds(70,23,60,17);

        button.setBounds(140,20,100,19);

        JTable table=new JTable(10,10);
        table.setRowHeight(10);
        table.setBounds(10,50,150,100);
        table.setCellSelectionEnabled(true);



        ListSelectionModel selectionModel=table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                System.out.println();
            }
        });




        frame.add(table);
        frame.add(button);
        frame.add(textField);
        frame.add(textField1);
        frame.add(label1);
        frame.add(label);



        frame.setLayout(null);
        frame.setVisible(true);
    }
}
