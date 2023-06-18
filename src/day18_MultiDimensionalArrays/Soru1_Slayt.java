package day18_MultiDimensionalArrays;

public class Soru1_Slayt {
    public static void main(String[] args) {

        //Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.

        int[][] arr={{0,2,4,6},{1,3,5,7},{9,8}};
        ciftTopla(arr);
    }
    public static void ciftTopla(int[][] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                   toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Verilen dizideki cift elemanlarin toplami= "+toplam);
    }
}
