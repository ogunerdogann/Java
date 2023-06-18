package day18_MultiDimensionalArrays;

public class C05_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayisi kactir?

        int toplamElement=0;
        for (int i = 0; i <arr.length ; i++) {
            toplamElement += arr[i].length;
        }
        System.out.println("Toplam Element Sayisi: "+toplamElement); //10


        // tüm elementlerin toplamini bulun.
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("Elementlerin toplami: "+toplam);

        // array'de kac tane cift sayi oldugunu bulun

        int ciftSayi=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    ciftSayi +=1;
                }
            }
        }
        System.out.println("Cift sayilarin sayisi: "+ciftSayi);

    }
}
