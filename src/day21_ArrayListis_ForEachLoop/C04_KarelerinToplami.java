package day21_ArrayListis_ForEachLoop;

public class C04_KarelerinToplami {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.

        int[] arr={1,2,3};
        karelerToplaminiYazdir(arr);

    }
    public static void karelerToplaminiYazdir(int[]arr){

        int karelerToplami=0;

        for (int each: arr
             ) {
            karelerToplami += each*each;
        }
        System.out.println("Verilen array'deki elementlerin kareleri toplami: "+karelerToplami);
    }
}
