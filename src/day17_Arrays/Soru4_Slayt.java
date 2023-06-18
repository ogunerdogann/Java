package day17_Arrays;

public class Soru4_Slayt {
    public static void main(String[] args) {

       // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
       // kullanildigini yazdiran bir method olusturun.

        int[] arr={1,2,3,4,5,5,5,6,7,7};
        yazdir(arr,8);
    }
    
    public static void yazdir(int[] arr, int Istenen){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (Istenen==arr[i]){
                sayac++;
            }
        }
        System.out.println(sayac);
        if (sayac==0) System.out.println("Eleman yok!");
    }
}
