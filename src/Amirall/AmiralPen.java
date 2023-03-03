package Amirall;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AmiralPen {
    public static JFrame frame;
    public static JTable table;

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

        table=new JTable(10,10);
        table.setRowHeight(20);
        table.setBounds(10,50,250,250);
        table.setCellSelectionEnabled(true);



        ListSelectionModel selectionModel=table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row=table.getSelectedRow();
                int colum=table.getSelectedColumn();
//                textField.setText((row+1)+"");
//                textField1.setText((colum+1)+"");
                //table.setValueAt("O",row,colum);
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
