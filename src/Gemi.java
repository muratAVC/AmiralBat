import java.util.Random;

public class Gemi {
    String shipName;// Gemi adını tutar
    int shipTall;//Gemi boyunu tutar
    int shipLokasyon_X;// X(Dik) konum tutar
    int shipLokasyon_Y;// Y(Yatay) konum tutar
    String[][] shipCoordinat;//geminin koordinatlarını tutar
    boolean status;//Batıp batmadığını tutar
    int live;
    boolean yat_dik;//geminin yatay veya dikey olduğunu tutuyor
                    // yataysa False dikeyse True alıyor
    public Gemi(String name,int tall){
        this.shipName=name;
        this.shipTall=tall;
        this.live=tall;
        this.status=true;//geminin batıp batmadığını tutuyor
        this.shipCoordinat= reset();
    }

    public void gemiKoordinatAta(){
        Random rnd=new Random();
        int yatayKonum,dikeyKonum;
        //geminin yatay veya dikey konumda olmasını belirler

        if(rnd.nextInt(0,11)<=5){//gemi yatay konumda ise

            this.shipLokasyon_X=rnd.nextInt(0,10);//dikey Konum
            this.shipLokasyon_Y=rnd.nextInt(0,(10-this.shipTall)+1);//Yatay konum
            this.yat_dik=true;
            yerles(this.shipLokasyon_X,this.shipLokasyon_Y,this.yat_dik);
        }else {//gemi dikey Konumda ise
            this.shipLokasyon_X= rnd.nextInt(0,(10-this.shipTall)+1);
            this.shipLokasyon_Y= rnd.nextInt(0,10);
            this.yat_dik=false;
            yerles(this.shipLokasyon_X,this.shipLokasyon_Y,this.yat_dik);
        }
    }



      private void yerles(int a,int b,boolean y){
//gemileri koordinat düzlemine yerleştiriyor
        if (!y) {//
            for (int i = a; i < this.shipTall+a; i++) {
                this.shipCoordinat[i][b] = "X";
            }
        } else {
            for (int i = b; i < this.shipTall+b; i++) {
                this.shipCoordinat[a][i] = "X";
            }
        }

    }
    public String[][] reset(){
        String[][] asd =new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                asd[i][j]=".";
            }
        }
     return asd;
    }

    public String isabetVarmi(int x,int y){
        String result="karavana";
        if(shipCoordinat[x][y]=="X"){
            result=this.shipName;
            shipCoordinat[x][y]="*";
        }

        return result;

    }


}
