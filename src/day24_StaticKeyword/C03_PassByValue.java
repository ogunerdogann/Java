package day24_StaticKeyword;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {

        int[] arr = {3,4,5};
        elementleriArtir(arr,2);
        System.out.println("method call'dan sonra array: "+Arrays.toString(arr));

        /*
        method call'dan sonra da array'in elemanlari degisti. Peki passByValue olayi burada gecerli degil mi?
        Gecerli. Su örnegi verebiliriz, bir arabanin icinde üc kisi olsun. Daha sonra üc kisi inip baskalari binsin.
        Degisen arabanin icindeki kisiledir, araba yine ayni kalir.
        Burada da sadece array'in icindeki elemanlar degisiyor.
         */
    }

    public static void elementleriArtir(int[] arr, int artisMiktari){

        for (int i = 0; i < arr.length; i++) {
            arr[i] += artisMiktari;
        }
        System.out.println("method'ta Array"+ Arrays.toString(arr));
    }
}
