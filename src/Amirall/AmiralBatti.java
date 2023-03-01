package Amirall;

import javax.swing.*;
import java.awt.*;
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
       AmiralPen amiralPen=new AmiralPen();



        Scanner in=new Scanner(System.in);
        SavasAlani area1=new SavasAlani(10,10);
        area1.gemiYerlestir();
        /*System.out.println("Amiral battı oyununa hoşgeldiniz\n" +
                "Oyun 10*10 luk bir savaş alanında oynanır\n" +
                "Alanda 5 adet gemi var.\nBunlar\n" +"1 Adet Amiral gemisi\n1 Adet kuruvazor\n1 Adet hücumbot\n2 Adet muhrip\n"+
                "Gemiler savaş alanına rastgele yerleştirilmiştir.\nAttığınız füzelerin hedef koordinatlarını vererek gemileri batırmaya çalışın\n" +
                "Bir gemiyi batırmak için onu tamamen atışlarınızla isabet ettirmelisiniz.\nBaşarılar");*/
        String isabetsonuc,a;
        int b,c = 0;
        yazdir(area1.savasAlan);
        System.out.println("Atış koordinatını giriniz\n" +
                    "Dikey koordinat için A-B-C-D-E-F-G-H-I-J\n" +
                    "Yatay koordinat için 1-2-3-4-5-6-7-8-9-10");

        do {
            
            a= in.nextLine();
            String girdi_2=a.substring(1);
            if(girdi_2.length()==2) {
            	if(girdi_2.equals("10")) {
            		b=Integer.valueOf(girdi_2);
            		b--;
            	}else {
            		System.out.println("Hatalı giriş yaptınız tekrar giriniz");
            		continue;
            	}
            }else {
            	if(girdi_2.matches("[0-9]")) {
            		b=Integer.valueOf(girdi_2);
            		b--;//javanın varsayılan dizi numaralamasına getirdik
            	}else {
            		System.out.println("Hatalı giriş yaptınız tekrar giriniz");
            		continue;
            	}	
            }
            
            
           
            a=a.substring(0,1).toUpperCase();
            
            
            if(!a.matches("[A-J]")){
                System.out.println("Hatalı giriş yaptınız tekrar giriniz");
                continue;
            }
            switch (a){
                case "A":c=0;break;
                case "B":c=1;break;
                case "C":c=2;break;
                case "D":c=3;break;
                case "E":c=4;break;
                case "F":c=5;break;
                case "G":c=6;break;
                case "H":c=7;break;
                case "I":c=8;break;
                case "J":c=9;break;
                case "İ":c=8;break;
            }


            isabetsonuc=area1.isabet(c,b);
            if(isabetsonuc.equals("karavana")){
                System.out.println("atışınız boşa gitti");
            }else {
                System.out.println(isabetsonuc+" gemisini vurdunuz");
            	if(isabetsonuc.equals("Amiral")) {
                	if(area1.amiral.gemiBattimi()) {
                		System.out.println(isabetsonuc+ " gemisi battı");
                	}
                }
            	if(isabetsonuc.equals("Kuruvazor")) {
                	if(area1.kuruvazor.gemiBattimi()) {
                		System.out.println(isabetsonuc+ " gemisi battı");
                	}
                }if(isabetsonuc.equals("Hucumbot")) {
                	if(area1.hucumBot.gemiBattimi()) {
                		System.out.println(isabetsonuc+ " gemisi battı");
                	}
                }if(isabetsonuc.equals("Muhrip1")) {
                	if(area1.muhrip1.gemiBattimi()) {
                		System.out.println(isabetsonuc+ " gemisi battı");
                	}
                }if(isabetsonuc.equals("Muhrip2")) {
                	if(area1.muhrip2.gemiBattimi()) {
                		System.out.println(isabetsonuc+ " gemisi battı");
                	}
                }
            	
                
            }


            if (area1.kalanGemiParcasi==0){
                System.out.println("Tüm gemileri vurdunuz/nYani Kazandınız");
                break;
            }

        }while (true);
        yazdir(area1.savasAlan);


    }
}
