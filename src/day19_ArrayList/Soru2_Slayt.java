package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru2_Slayt {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.

        System.out.println(isimDöndür());

    }
    public static List<String> isimDöndür(){

        Scanner scan = new Scanner(System.in);


        String isim ="";
        List<String> isimler = new ArrayList<>();

        while (isim.equalsIgnoreCase("Q") != true){

            System.out.println("Lütfen eklemek istediginiz ismi yaziniz: "
                    +"\nEklemeyi sonlandirmak icin 'Q' ya basiniz.");
            isim = scan.nextLine();
            if (isim.equalsIgnoreCase("Q") == true) {
                break;
            }
            isimler.add(isim);
        }

        System.out.println("Islemi sonlandirdiniz!");
        return isimler;
    }
}
