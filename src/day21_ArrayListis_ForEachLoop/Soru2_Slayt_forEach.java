package day21_ArrayListis_ForEachLoop;

public class Soru2_Slayt_forEach {
    public static void main(String[] args) {

        //Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.

        int arr[] = {0,1,2,3,4};

        karelerToplamiYazdir(arr);
    }

    public static void karelerToplamiYazdir(int[] arr){

        int toplam=0;

        for (int each:arr)
        {
        toplam += arr[each]*arr[each];
        }

        System.out.println("Kareler toplami= "+toplam);
    }
}
