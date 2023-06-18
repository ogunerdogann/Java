package day21_ArrayListis_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        /*
        Bizden istenen görevde siralama önemsiz ise asil amaclanan tüm elementleri elden gecirmek ise
        for loop yerine for each loop tercih edilir.

        For each loop'ta index yoktur. Baslangic degeri ve bitis degeri de yoktur.

         */

           int[] arr={5,6,7,1,6,9,2,3,4,8,0,2,11,5,6};

           // Array'in tüm elementlerinin toplamini yazdirin.
            int toplam=0;

        for (int each: arr              //arr'deki her int degerlerini getir!
             ) {
            toplam += each;             // herbir (each) elementi toplama (toplayarak) ata
        }
        System.out.println(toplam);

           // Array'in elementlerinden 3 ile bölünebilenleri yazdirin.

        for (int each: arr
             ) {
            if (each%3==0){
                System.out.println(each);
            }
        }

          // Array'in elementleri icinde kac tane tek sayi oldugunu bulun.
        int sayac=0;
        for (int tek:arr
             ) {
            if (tek%2!=0){
                sayac++;
                System.out.print(tek+" ");
            }
        }System.out.println("\nSayac= "+sayac);


    }
}
