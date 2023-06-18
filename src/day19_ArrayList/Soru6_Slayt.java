package day19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru6_Slayt {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun.

        System.out.println(tamBölenDöndür());
    }
    public static List<Integer> tamBölenDöndür(){

        List<Integer> tamBölen =null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi <= 0) System.out.println("Hatali parametre girdiniz!!!");
        else {

            tamBölen = new ArrayList<>();
            for (int i = 1; i <= sayi ; i++) {

                if (sayi%i == 0){
                    tamBölen.add(i);
                }
            }

        }

        return tamBölen;
    }
}
