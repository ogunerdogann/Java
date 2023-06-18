package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class Soru2_Slayt {
    public static void main(String[] args) {

       // Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
       // olusturacagimiz tek katli bir array’e bu toplamlari atayin.
       // input : int[][] arr = {{3,4,5}, {2,3,6,7}};
       // output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7},{1,2,3,4,5}};
        int boyut=arr[1].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<boyut){
                boyut=arr[i].length;
            }
        }

        int[] arr2=new int[boyut]; // [0 0 0]
        int indexlerToplami=0;

        for (int i = 0; i <arr2.length ; i++) {   // Böylece ic arraylerdeki indexleri geziyoruz, en kisa ic array'in uzunlugu kadar!
            for (int j = 0; j < arr.length ; j++) { // j ile de dis array'leri geziyoruz, ic tarafa yazildigi icin!

                arr2[i] += arr[j][i];  // 00,10,20 - 01,11,21 - 02,12,22
            }

        }
        System.out.println(Arrays.toString(arr2));
    }
}
