package Kendi_Notlarim;

public class Array_Soru6 {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
       // olusturun

        String[] arr= {"Ogün","Erdogan","Yazilim","Test","Biyomedikal","Ali"};
        enUzunEnKisaYazdir(arr);
    }
    public static void enUzunEnKisaYazdir(String[] arr){

        String enUzun = "";
        String enKisa = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }
            if (arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }

        }
        System.out.println("Verilen dizide en uzun kelime: "+enUzun);
        System.out.println("Verilen dizide en kisa kelime: "+enKisa);

    }
}
