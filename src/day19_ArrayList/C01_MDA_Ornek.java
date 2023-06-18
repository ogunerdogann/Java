package day19_ArrayList;

import java.util.Arrays;

public class C01_MDA_Ornek {
    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
       // olusturacagimiz tek katli bir array’e bu toplamlari atayin.
       // input : int[][] arr = {{3,4,5}, {2,3,6,7}};
       // output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7}};
        System.out.println(arr.length);

        // ortak index kullanabilmek icin en kisa olani bulmaliyiz.

        int enKisaArrayLength =arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < enKisaArrayLength){

                enKisaArrayLength=arr[i].length;
            }

        }

        // toplamlari koymak icin yeni bir array olusturalim.

        int[] toplamArrayi = new int[enKisaArrayLength];    // [0 0 0]

        int indextekiElementlerToplami=0;

        for (int i = 0; i < toplamArrayi.length; i++) {  //böylece ic arraylardeki elemanlara ulasyoruz, en kisa ic array'in uzunlugu kadar!
            for (int j = 0; j < arr.length; j++) {  // burada j dis array'leri geziyor önce yazildigi icin!
                toplamArrayi[i] += arr[j][i];     // 00, 10 - 01,11 - 02,12
            }


        }
        System.out.println(Arrays.toString(toplamArrayi));
    }
}
