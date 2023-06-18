package day17_Arrays;

import java.util.Arrays;

public class Soru1_Slayt {
    public static void main(String[] args) {

       // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr ={1,2,3,4,5,6};
        arr=arrayArtirma(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayArtirma(int[] arr,int artirilacakSayi){

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=artirilacakSayi;
        }
        return arr;
    }
}
