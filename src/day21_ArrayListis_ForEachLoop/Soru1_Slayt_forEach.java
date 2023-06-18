package day21_ArrayListis_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru1_Slayt_forEach {
    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
       // elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin

        int[] arr = {0,1,1,2,2,3,3,3,4,4,5,6,6,6,8,9,7,7,8,7,10};
        List<Integer> liste = new ArrayList<>();

        for (int each:arr)
        {
            if (!liste.contains(each)){
                liste.add(each);
            }
        }

        arr  = new int[liste.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=liste.get(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
