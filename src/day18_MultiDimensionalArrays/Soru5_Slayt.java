package day18_MultiDimensionalArrays;

public class Soru5_Slayt {
    public static void main(String[] args) {

        //Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //toplaminini yazdiran bir method olusturun.

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        sonElementToplamYazdir(arr);

    }

    public static void sonElementToplamYazdir(int[][] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[i].length-1; j <arr[i].length ; j++) { //j'nin baslangic noktasini öyle ayarladik ki, sadece her bir inner array'in son elementini alacak!

                toplam += arr[i][j];
            }
        }
        System.out.println("Son elementlerin toplami: "+toplam);
    }
}
