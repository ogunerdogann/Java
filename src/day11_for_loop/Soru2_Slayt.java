package day11_for_loop;

import java.util.Scanner;

public class Soru2_Slayt {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz: ");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }
        }

    }
}
