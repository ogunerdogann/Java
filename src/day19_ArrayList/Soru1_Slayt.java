package day19_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru1_Slayt {
    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        int[] arr = {0,1,2,3,2,3,3,4,5,6,4,4,4,0,6,9,5,6,5,6,5,6,5,6};
        System.out.println(Arrays.toString(tekrarsizDondur(arr)));

    }
    public static int[] tekrarsizDondur(int[] arr){

        List<Integer> liste = new ArrayList<>();  // Liste olusturduk

        for (int i = 0; i < arr.length; i++) {  // array icindekileri listeye atiyoruz.

            if (!liste.contains(arr[i])){  // eger listede o eleman yoksa atamayi yapiyor.

                liste.add(arr[i]);
            }
        }

        int[] arr2 = new int[liste.size()]; // sonucu yine bir array seklinde döndürmek istiyoruz.

        for (int i = 0; i <liste.size() ; i++) {  // listedeki elemanlari array'e atiyoruz.
            arr2[i] = liste.get(i);
        }

        return arr2;
    }
}
