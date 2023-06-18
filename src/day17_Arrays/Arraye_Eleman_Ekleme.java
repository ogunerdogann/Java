package day17_Arrays;

import java.util.Arrays;

public class Arraye_Eleman_Ekleme {
    public static void main(String[] args) {

        // Verilen array'a istenen degeri atayalim

        int[] a={1,2,3};
        int[] b={3,4,5,6,7};

        a=b;
        System.out.println(Arrays.toString(a));
        a=new int[4];   // [0,0,0,0] direk atama yaparsak eski degerler kaybolur
        System.out.println(Arrays.toString(a));

        /*
           önce istenen uzunlukta yeni bir array olusturup
           eski array'deki tüm elementleri yeni array'e tasiyoruz
           sonra istenen elementi de atayip
           yeni olan istedigimiz hale gelince
           eskiarr=yeniarr diyerek yeni array'in degerini eskisine atiyoruz
         */
        int[] arr={4,5,6};
        int eklenecekDeger=10;
        int[] yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekDeger;
        arr=yeniArr;
        System.out.println(Arrays.toString(yeniArr));
        System.out.println(Arrays.toString(arr));


        /*
            Array'in uzunlugu degistirilemez ancak
            Array'e yeni bir array degeri atanabilir.
         */

    }
}
