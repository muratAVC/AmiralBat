import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AmiralBatti {
    public static void yazdir(String[][] arr){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        SavasAlani area1=new SavasAlani(10,10);
        area1.gemiYerlestir();
        System.out.println("Amiral battı oyununa hoşgeldiniz\n" +
                " oyun 10*10 luk bir savaş alanında oynanır\"" +
                "Alanda 5 adet gemi var. Bunlar\n" +"1 Adet Amiral gemisi\n1 Adet kuruvazor\n1 Adet hücumbot\n2 Adet muhrip\n"+
                "Gemiler savaş alanına rastgele yerleştirilmiştir.\nAttığınız füzelerin hedef koordinatlarını vererek gemileri batırmaya çalışın\n" +
                "Bir gemiyi batırmak için onu tamamen atışlarınızla isabet ettirmelisiniz.\nBaşarılar");
        String a;
        int b,c = 0;

        do {
            System.out.println("Atış koordinatını giriniz\n" +
                    "Dikey koordinat için A-B-C-D-E-F-G-H-I-J\n" +
                    "Yatay koordinat için 1-2-3-4-5-6-7-8-9-10");
            a= in.nextLine();
            b=Integer.valueOf(a.substring(1));
            a=a.substring(0,1).toUpperCase();
            if(b<1 || b>10){
                System.out.println("Hatalı giriş yaptınız tekrar giriniz");
                continue;
            }
            if(!a.matches("[A-J]")){
                System.out.println("Hatalı giriş yaptınız tekrar giriniz");
                continue;
            }
            switch (a){
                case "A":c=1;break;
                case "B":c=2;break;
                case "C":c=3;break;
                case "D":c=4;break;
                case "E":c=5;break;
                case "F":c=6;break;
                case "G":c=7;break;
                case "H":c=8;break;
                case "I":c=9;break;
                case "J":c=10;break;
            }
            if(area1.isabet(c,b).equals("karavana")){
                System.out.println("atışınız boşa gitti");
            }else {
                System.out.println(area1.isabet(c,b)+" gemisini vurdunuz");
            }


            if (area1.kalanGemiParcasi==0){
                System.out.println("Tüm gemileri vurdunuz");
                break;
            }

        }while (true);
        yazdir(area1.savasAlan);


    }
}
