import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AmiralPen {
     public AmiralPen() {
        JFrame pencere = new JFrame("Amiral Battı");
        pencere.setSize(500, 500);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.getContentPane().setLayout(new BorderLayout());

         JMenuBar mb = new JMenuBar();
         JMenu m1 = new JMenu("Dosya");
         JMenu m2 = new JMenu("Yardım");
         mb.add(m1);
         mb.add(m2);
         JMenuItem m11 = new JMenuItem("Aç");
         JMenuItem m22 = new JMenuItem("Farklı Kaydet");
         m1.add(m11);
         m1.add(m22);
         m2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 YardimPen Yardim= new YardimPen();

             }
         });

         pencere.add("North",mb);



        JLabel metin = new JLabel("Amiral battı oyununa hoşgeldiniz");
        metin.setFont(new Font("Serif", Font.BOLD, 25));
        pencere.add("West", metin);

        JButton buton = new JButton("Çıkış");
        buton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        pencere.add("South", buton);

        pencere.setVisible(true);
    }


    public static void main(String[] args) {
        AmiralPen pen=new AmiralPen();
    }
}
