package Kendi_Notlarim;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Soru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.
        arrayOlusturma(5);

    }
    public static int[] arrayOlusturma(int boyut){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dizinin elemanlarini giriniz: ");
        int[] arr= new int[boyut];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();

        }
        System.out.println("Olusturmus oldugunuz "+boyut+" elemanli dizi: "+Arrays.toString(arr));
        return arr;
    }
}
