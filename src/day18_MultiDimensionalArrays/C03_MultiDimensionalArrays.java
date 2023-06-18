package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{3,4,5},{2,3},{1}}; // iki katli array. Bastan veya sondan süslü parantez sayisiyla anlasilabilir.

        //int[][] iki katli array belirtir. Ilk köseli parantez ana array'i (outher array) kontrol eder.
        // ikinci koseli parantez ise icerideki array'leri (inner array) kontrol eder.

        System.out.println(arr[1][1]); // 3
        System.out.println(arr[2][0]); // 1
        System.out.println(arr[0][2]); //5
        System.out.println(arr[1].length); //2
        System.out.println(Arrays.toString(arr[1])); //[2,3]
        System.out.println(Arrays.deepToString(arr)); //[[3, 4, 5], [2, 3], [1]] hepsini yazdirir
        System.out.println(arr.length); //3

    }
}
