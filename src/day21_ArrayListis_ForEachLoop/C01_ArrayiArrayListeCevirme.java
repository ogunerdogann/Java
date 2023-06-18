package day21_ArrayListis_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {

        Integer[] arr={5,6,7,1,6,9,2,3,4,8,0,2,11,5,6};

        // arr dizisinin elemanlarini iceren bir arrayList olusturunuz.

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println("sayilar Listesi: "+sayilar);

        //JAVA'da bir array'i arrayList'e cevirmeye yarayan asList() komutu da vardir.
        //Ancak kullanilmasi tavsiye edilmez cünkü iki büyük dezavantaji vardir.
        //1- asList kullanilarak array'den List'e cevrilen Listelerde ekleme- silme gibi uzunlugu
        //degistiren methodlar kullanilamaz!
        //2- Arka planda array ve array'den dönüstürdügümüz List beraber hareket eder.
        // Birinde yaptigimiz update'ler ötekine de islenir.

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Array'den List'e ceviren: "+arraydenList);

        //1. dezavantaj
        // iki List'e de 11 ekleyelim

        sayilar.add(11);
       // arraydenList.add(11);
        System.out.println(sayilar+"\n"+arraydenList);

        // iki listeden de 0. index'leri silelim

        sayilar.remove(0);
        //arraydenList.remove(0);   hata verir!


        //2. dezavantaj
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Array'den List: "+arraydenList);

        // array'in bir elementine yeni deger atayalim
        arr[0]=22;

        System.out.println("======= array'i degistirdikten sonra =======");
        System.out.println("Array'den List: "+arraydenList);
        System.out.println("Array: "+Arrays.toString(arr));


        // List'in bir elementini update edelim
        System.out.println("======= List'i degistirdikten sonra ========");

        arraydenList.set(1,45);
        System.out.println("======= array'i degistirdikten sonra =======");
        System.out.println("Array'den List: "+arraydenList);
        System.out.println("Array: "+Arrays.toString(arr));
    }
}
