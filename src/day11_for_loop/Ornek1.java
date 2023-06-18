package day11_for_loop;

public class Ornek1 {
    public static void main(String[] args) {

        // 20'den baslayip 7'ser artarak 100'e kadar yazdirin
        // (100 yazdirmamiz gerekiyorsa yazdirin ama 100'ü gecmeyin)

        for (int i = 20; i <=100 ; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println("");

        //100'den baslayarak 1'e kadar (sinirlar dahil) 7 ile bölünebilen sayilari yazdirin

        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){

                System.out.print(i+" ");
            }
        }
    }
}
