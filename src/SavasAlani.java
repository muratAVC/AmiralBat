import java.util.Random;

public class SavasAlani {
    String[][] savasAlan;
    Gemi amiral;
    Gemi kuruvazor;
    Gemi hucumBot;
    Gemi muhrip1;
    Gemi muhrip2;


    public  SavasAlani(int heigth,int weigth) {
        savasAlan=new String[heigth][weigth];
        amiral=new Gemi("Amiral",5);
        kuruvazor=new Gemi("Kuruvazor",4);
        hucumBot=new Gemi("Hucumbot",2);
        muhrip1=new Gemi("Muhrip",3);
        muhrip2=new Gemi("Muhrip",3);


    }
    public void gemiYerlestir(String gemiAd){

      amiral.yerlestir();
      kuruvazor.yerlestir();
      muhrip1.yerlestir();
      muhrip2.yerlestir();
      hucumBot.yerlestir();

    }

}
