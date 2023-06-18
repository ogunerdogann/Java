package day17_Arrays;

import java.util.Arrays;

public class Ornek_Saga_Kaydirma {
    public static void main(String[] args) {

        //Verile int bir array'deki tüm elementleri bir saga kaydirin
        //sondaki elementi de en basa alip kaydedin
        //orn: [3,4,5,6] ===> [6,3,4,5]

        int[] arr={3,4,5,6};
        System.out.println(arr.length);

        int temp=arr[arr.length-1];

        for (int i = 0; i < arr.length-1 ; i++) {
            arr[arr.length-1-i]=arr[arr.length-2-i];
        }

        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
