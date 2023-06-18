package Burkay_Alistirma;

public class WhileLoop_Soru3Slayt {
    public static void main(String[] args) {

        /*

        Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        donduren bir method olusturun.

         */
        System.out.println(TersDöndür("Ogün Erdogan"));

    }
    public static String TersDöndür(String cümle){

        String yeniKelime="";
        int uzunluk=cümle.length();


        while (uzunluk>0){

            yeniKelime += cümle.charAt(uzunluk-1);
            uzunluk--;

        }
        return yeniKelime;
    }
}
