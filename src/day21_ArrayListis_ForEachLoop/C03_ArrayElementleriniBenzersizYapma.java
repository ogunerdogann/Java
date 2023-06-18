package day21_ArrayListis_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {

       // Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
       // elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        int[] arr={5,6,7,1,6,9,2,3,4,8,0,2,11,5,6};

        List<Integer> benzersizElementListesi = new ArrayList<>();

        // array'deki her bir elementi kontrol edelim
        // List'de yoksa ekleyelim varsa eklemeyelim

        for (int each: arr
             ) {

            if (!benzersizElementListesi.contains(each)){
                benzersizElementListesi.add(each);
            }
        }
        System.out.println(benzersizElementListesi);

        arr=new int[benzersizElementListesi.size()];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = benzersizElementListesi.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
