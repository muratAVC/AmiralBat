import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YardimPen {
    public YardimPen(){
        JFrame YarPen = new JFrame("Amiral Battı");
        YarPen.setSize(500, 500);
        YarPen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        YarPen.getContentPane().setLayout(new BorderLayout());

        JLabel metin = new JLabel("Amiral battı oyununa hoşgeldiniz" +
                "\"Oyun 10*10 luk bir savaş alanında oynanır\n" +
                "\"Alanda 5 adet gemi var.\nBunlar\n 1 Adet Amiral gemisi\n 1 Adet kuruvazor\n1 Adet hücumbot\\n2 Adet muhrip\\n\"+\n" +
                "\"Gemiler savaş alanına rastgele yerleştirilmiştir.\\nAttığınız füzelerin hedef koordinatlarını vererek gemileri batırmaya çalışın\\n\" +\n" +
                "\"Bir gemiyi batırmak için onu tamamen atışlarınızla isabet ettirmelisiniz.\\nBaşarılar\"");
        metin.setFont(new Font("Serif", Font.BOLD, 25));
        YarPen.add("West", metin);

        JButton buton = new JButton("Çıkış");
        buton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YarPen.setVisible(false);
            }
        });
        YarPen.add("South", buton);
        YarPen.setVisible(true);

    }
}
