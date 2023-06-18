package Kendi_Notlarim;

import java.util.Arrays;

public class Array_Soru3 {
    public static void main(String[] args) {

        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
       // Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int[] arr={4,5,6,7,8};
        arr=DiziKaydir(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] DiziKaydir(int[] dizi){

        int basDeger=dizi[dizi.length-1];

        for (int i = 0; i <dizi.length-1 ; i++) {
            dizi[dizi.length-i-1]=dizi[dizi.length-i-2];
        }
        dizi[0]=basDeger;
        return dizi;
    }
}
