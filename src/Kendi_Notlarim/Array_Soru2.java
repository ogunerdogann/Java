package Kendi_Notlarim;

public class Array_Soru2 {
    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
       // method yaziniz.

        int[] arr={0,-1,-2,-3,-4,-5,6,7,8,9};
        System.out.println(pozitifToplam(arr));
    }
    public static int pozitifToplam(int[] dizi){

        int toplam=0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>0){
               toplam += dizi[i];
            }
        }
        return toplam;
    }
}
