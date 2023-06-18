package day17_Arrays;

import java.util.Arrays;

public class Soru3_Slayt {
    public static void main(String[] args) {

       // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
      //  basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
       // Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int[] arr={1,2,3,4,5};
        arr=TersCevir(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] TersCevir(int[] arr){

        int[] yeniArr=new int[arr.length];
        int basElement=arr[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            arr[arr.length-1-i] = arr[arr.length-2-i];
            yeniArr=arr;
        }
        arr[0]=basElement;
        return yeniArr;
    }

}
