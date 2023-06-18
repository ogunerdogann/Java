package day21_ArrayListis_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElementleriBulma {
    public static void main(String[] args) {

        //Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin.

        int[] arr1={2,3,6,7,4};
        int[] arr2={1,3,5,7,9,3};
        List<Integer> ortakElementListe= new ArrayList<>();
        for (int each: arr1
             ) {
            for (int each2: arr2
                 ) {
                if (each==each2) {
                    if (!ortakElementListe.contains(each)) {
                        ortakElementListe.add(each);

                    }
                }
            }
        }
        System.out.println(ortakElementListe);
    }
}
