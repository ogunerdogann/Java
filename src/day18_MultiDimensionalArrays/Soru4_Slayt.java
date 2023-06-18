package day18_MultiDimensionalArrays;

public class Soru4_Slayt {
    public static void main(String[] args) {

       // Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpimini bize donduren bir
       // method olusturun.

        int[][] arr = {{1,2,3,4},{4,3,2,1}};
        System.out.println(carpimDondur(arr));

    }

    public static int carpimDondur(int[][] arr){

        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                carpim *= arr[i][j];
            }
        }
        return carpim;
    }
}
