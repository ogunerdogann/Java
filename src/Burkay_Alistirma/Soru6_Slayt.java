package Burkay_Alistirma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru6_Slayt {
    public static void main(String[] args) {

      //  Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
      //  tamsayilari bir liste olarak bize donduren bir method olusturun.

        tambolenDöndür();
    }
    public static List<Integer> tambolenDöndür(){

        Scanner scan = new Scanner(System.in);
        System.out.println("SAyi gir");
        int sayi= scan.nextInt();
        List<Integer> liste = new ArrayList<>();



        if (sayi>0) {
            for (int i = 1; i <= sayi; i++) {

                if (sayi % i == 0) {

                    liste.add(i);
                }
            }
        }
        else System.out.println("hatali giris");

        System.out.println(liste);
        return liste;
    }
}
