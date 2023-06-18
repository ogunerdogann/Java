package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q8_nestedIf {
    public static void main(String[] args) {

        /*
        1- Kullanicinin EYT'li olup olmadigini kontrol eden
        ve emekli olup olamayacagini belirleyen programi yaziniz.
          KURALLAR:
          Kadinlar : 5000 prim günü, 20 yil hizmet süresi
          Erkekler : 5500 prim günü, 25 yil hizmet süresi

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz: ");
        char cins = scan.next().charAt(0);

        System.out.println("Lütfen prim gününüzü giriniz: ");
        int prim = scan.nextInt();

        System.out.println("Lütfen hizmet sürenizi yil olarak giriniz: ");
        double hizmet_yili = scan.nextDouble();


        if (cins == 'k' || cins == 'K'){
            if (prim >= 5000){
                if (hizmet_yili >=20){

                    System.out.println("Emekli olabilirsiniz");
                }
                else System.out.println("Hizmet yiliniz yeterli degil!");
            }
            else System.out.println("prim gününüz yeterli degil!");
        }
        else if (cins == 'e' || cins == 'E') {
            if (prim >= 5500){
                if (hizmet_yili >= 25){
                    System.out.println("Emekli olabilirsiniz");
                }
                else System.out.println("Hizmet yiliniz yeterli degil!");
            }
            else System.out.println("prim gününüz yeterli degil!");
        }
        else System.out.println("Hatali cinsiyet girisi yaptiniz!");

    }
}
