package day03_data_casting;

public class C02_Explicit_Narrowing {
    public static void main(String[] args) {

        //Explicit Narroving zor kullanarak, zorlayarak daraltma islemidir.

        double db1=45.32;
       // int in1=db1; // int bir variable a bir double atamaya calisiyoruz ve uyari aliyoruz.
        int in1=(int)db1; // burada javayi bu degeri atmasi icin zorluyoruz. Java bunu yapar ancak ver kayiplari yasanabilir!
        db1=5654546464666464d; // cok büyük bir sayi oldugundan double oldugunu bildirmek icin sonuna d yaziyoruz yoksa hata veriyor.
        in1=(int)db1;// buradan sonra yazdirirsan in1 degerinin 2 milyar civarlarinda oldugunu görürsün. Cünkü int ancak o kadar alabiliyor. Gerisi veri kaybi.
        System.out.println(in1);


        in1=34;
        byte by1=(byte)in1; //byte <==== int  byte= -128----127
        System.out.println(by1); //sikinti yok!

        in1=130;
        by1=(byte)in1;
        System.out.println(by1); //-126 verdi! Neden?

        /*
        byte= -128-----127
        128 verince 127 den 1 öteye gider ve -128 (sayi dogrusu düsün uca geldiginde(127) bir sonraki deger olarak en basa (-128) e gider)
        129   "      "      2   "     "    "  -127
        130   "      "      3   "     "    "  -126
        150   "      "     23   "     "    "  -106
        256   "      "     129  "     "    "    0
         */

    }
}
