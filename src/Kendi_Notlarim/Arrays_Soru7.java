package Kendi_Notlarim;

import java.util.Arrays;

public class Arrays_Soru7 {
    public static void main(String[] args) {

        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int[] arr={1,2,6,5};
        arr= elemanEkleme(arr,23);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(elemanEkleme(arr,23)));


    }
    public static int[] elemanEkleme(int[] arr, int eklenecekEleman){

        int[] yeniArr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;
        return yeniArr;
    }
}
