package Kendi_Notlarim;

import java.util.Arrays;

public class Array_Soru1 {
    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr={0,1,2,3,4,5,6,7,8,9};
        arr=ArrayArtir(arr,4);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] ArrayArtir(int[] dizi,  int artirilacakDeger){

        for (int i = 0; i <dizi.length ; i++) {
            dizi[i] += artirilacakDeger;
        }
        return dizi;
    }
}
