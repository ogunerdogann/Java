package day14_methodOverloading_While_loop;

public class C01_AsalSayi {
    public static void main(String[] args) {

        //Verilen pozitif bir tamsayinin asal sayi olup olmadigini
        //yazdiran bir method olusturun

        asalsayiyaz(35);
        asalsayiyaz(2);
        asalsayiyaz(17);

    }

    public static void asalsayiyaz(int sayi){

        int flag=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                flag++;
                break;     //sart saglandiginda sonuna kadar gitmesine gerek yok. for loop'u bitirir!
            }
        }
        if (sayi==2) System.out.println("Sayi Asaldir!");
        else if (flag==0) System.out.println("Sayi Asaldir!");
        else System.out.println("Sayi Asal Degildir!!");
    }
}
