package day14_methodOverloading_While_loop;

public class C02_isAsal {
    public static void main(String[] args) {

        // Verilen birden büyük bir tamsayi icin
        //sayi asal ise true
        //sayi asal degil ise false dönen bir method olusturun

        System.out.println(isAsal(20));
        System.out.println(isAsal(23));

        boolean sonuc=isAsal(47); // sonuc variable'ina false degeri atar!


    }
    public static boolean isAsal(int sayi){
        int flag=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                flag++;
                break;     //sart saglandiginda sonuna kadar gitmesine gerek yok. for loop'u bitirir!
            }
        }
        if (sayi==2) {

            return true;
        }
        else if (flag==0) {

            return true;
        }
        else
        return false;          //3 kontrol durumu icin de return yazmamiz gerekir!!
    }
}
