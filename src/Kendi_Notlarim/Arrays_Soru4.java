package Kendi_Notlarim;

public class Arrays_Soru4 {
    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
       // kullanildigini yazdiran bir method olusturun.

        int[] arr={1,2,6,5,3,8,9,3,2,1,5,3,2,3,6,9};
        elemanKontrol(arr,0);

    }
    public static void elemanKontrol(int[] arr, int aranacakEleman){

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            if (aranacakEleman==arr[i]){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Aradiginiz Eleman dizide kullanilmamistir!");
        }else {
            System.out.println("Aradiginiz eleman dizide "+sayac+" defa kullanilmistir");
        }


    }
}
