package Burkay_Alistirma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysLit_Soru2_Slayt {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.

        System.out.println(isimDöndür());

    }
    public static List<String> isimDöndür (){

        Scanner scan = new Scanner(System.in);
        //System.out.println("Lütfen isimlerini giriniz"+"\nBitirmek icin Q'ya basiniz!");
        String isim = ""; // Burada önce bos deger atadik!
        List<String> isimler = new ArrayList<>();

        while(!isim.equalsIgnoreCase("q")){
            System.out.println("Lütfen isimlerini giriniz"+"\nBitirmek icin Q'ya basiniz!");
            isim = scan.nextLine();
            isimler.add(isim);

            if (isim.equalsIgnoreCase("q")==true){
                isimler.remove(isimler.size()-1);
                break;
            }
        }


        return isimler;
    }
}
