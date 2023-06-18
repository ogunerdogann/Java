package day17_Arrays;

public class Soru2_Slayt {
    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int[] arr={-1,-2,-3,1,2,3,0,5};
        System.out.println(ArrTopla(arr));

    }

    public static int ArrTopla(int[] eleman){

        int toplam=0;

        for (int i = 0; i <eleman.length ; i++) {
            if (eleman[i] >= 0){
                toplam += eleman[i];
            }
        }
        return toplam;
    }
}
