package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {

        // Verilen bir array'de istenen elemanin olup olmadigini bulun.

        int[] arr={4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 5)); //-2
        System.out.println(Arrays.binarySearch(arr,11)); //4 (index)
        System.out.println(Arrays.binarySearch(arr,1)); //-1
        System.out.println(Arrays.binarySearch(arr,7)); //-2


        /*
           Array'lerde binarySearch methodunun düzgün calismasi icin öncelikle
           sort() calistirilmalidir.
         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 3, 4, 4, 5, 6, 7, 9, 11]

        System.out.println(Arrays.binarySearch(arr, 5)); //4 (index)
        System.out.println(Arrays.binarySearch(arr,11)); //8 (index)
        System.out.println(Arrays.binarySearch(arr,1)); //0 (index)  simdi degerler dogru!
        System.out.println(Arrays.binarySearch(arr,7)); //6 (index)
        System.out.println(Arrays.binarySearch(arr,4)); //2  2 tane var ilk rastladigini verir!

        // binarySearch() aranan elementin index'ini döner
        System.out.println(Arrays.binarySearch(arr,2)); //-2
        System.out.println(Arrays.binarySearch(arr,-3)); //-1
        System.out.println(Arrays.binarySearch(arr,8));  //-8
        System.out.println(Arrays.binarySearch(arr,10)); //-9
        System.out.println(Arrays.binarySearch(arr,13)); //-10
        System.out.println(Arrays.binarySearch(arr,20));  //-10

        // Olmayan bir element aratilirsa önce array'de olsaydi nerede olurdu
        // bunu buluyoruz. Sonra olmasi gereken siranin - isaretli degerini veriyoruz.
        // bu mantikla en kücük elementten daha kücük bütün sayilar icin -1,
        // en büyük elementten büyük olan bütün sayilar icin de -length-1 degeri döndürür!
        // Bizim örnegimizde length 9. O nedenle daha büyük degerlerde -10 döndürüyor.

        // BINARY TREE Incele!
        // Iki Array'in esitligini kontrol etme incele!
    }
}
