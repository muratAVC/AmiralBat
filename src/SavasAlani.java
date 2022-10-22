import java.util.Random;

public class SavasAlani {
    String[][] savasAlan;
    Gemi amiral;
    Gemi kuruvazor;
    Gemi hucumBot;
    Gemi muhrip1;
    Gemi muhrip2;
    int kalanGemiParcasi=17;


    public  SavasAlani(int heigth,int weigth) {
        savasAlan=new String[heigth][weigth];

        amiral=new Gemi("Amiral",5);
        kuruvazor=new Gemi("Kuruvazor",4);
        hucumBot=new Gemi("Hucumbot",2);
        muhrip1=new Gemi("Muhrip",3);
        muhrip2=new Gemi("Muhrip",3);
        savasAlan=amiral.reset();
    }
    public String isabet(int x,int y){
        //isabet hangi gemiye olmuş
        if (!amiral.isabetVarmi(x,y).equals("karavana")){
            this.kalanGemiParcasi--;
            return "Amiral";
        }
        if (!kuruvazor.isabetVarmi(x,y).equals("karavana")){
            this.kalanGemiParcasi--;
            return "Kuruvazor";
        }
        if (!hucumBot.isabetVarmi(x,y).equals("karavana")){
            this.kalanGemiParcasi--;
            return "Hucumbot";
        }
        if (!muhrip1.isabetVarmi(x,y).equals("karavana")){
            this.kalanGemiParcasi--;
            return "Muhrip1";
        }
        if (!muhrip2.isabetVarmi(x,y).equals("karavana")){
            this.kalanGemiParcasi--;
            return "Muhrip2";
        }
        return "karavana";
    }

    public void gemiYerlestir(){


      amiral.gemiKoordinatAta();
      gemiSavasAlaniKoy(amiral.shipCoordinat);

      do {
          kuruvazor.shipCoordinat=kuruvazor.reset();
          kuruvazor.gemiKoordinatAta();
      }while(kontrol(kuruvazor.shipCoordinat));
      gemiSavasAlaniKoy(kuruvazor.shipCoordinat);
      do {
           muhrip1.shipCoordinat=muhrip1.reset();
            muhrip1.gemiKoordinatAta();
      }while(kontrol(muhrip1.shipCoordinat));
      gemiSavasAlaniKoy(muhrip1.shipCoordinat);
        do {
            muhrip2.shipCoordinat=muhrip2.reset();
            muhrip2.gemiKoordinatAta();
        }while(kontrol(muhrip2.shipCoordinat));
        gemiSavasAlaniKoy(muhrip2.shipCoordinat);
        do {
            hucumBot.shipCoordinat=hucumBot.reset();
            hucumBot.gemiKoordinatAta();
        }while (kontrol(hucumBot.shipCoordinat));
        gemiSavasAlaniKoy(hucumBot.shipCoordinat);


    }
    public boolean kontrol(String[][] gemi){
        boolean result=false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(this.savasAlan[i][j]=="X" && gemi[i][j]=="X" ){
                    result=true;
                }
            }
        }
        return result;
    }
    public void gemiSavasAlaniKoy(String[][] ship ){
        for (int i = 0; i < 10; i++) {//this method places the ship on the battlefield
            for (int j = 0; j < 10; j++) {
                if(ship[i][j].equals("X")){
                    this.savasAlan[i][j]=ship[i][j];
                }
            }
        }
    }



}
