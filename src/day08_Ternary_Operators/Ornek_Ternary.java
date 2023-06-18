package day08_Ternary_Operators;

import java.util.Scanner;

public class Ornek_Ternary {
    public static void main(String[] args) {

        //Kullanicidan bir tamsayi alin. Sayi pozitifse cift sayi veya cift sayi degil
        //seceneklerinden uygun olani yazdirin. Sayi pozitif degilse 3 basamakli veya
        //3 basamakli degil seceneklerinden uygun olani yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz: ");
        int tamsayi=scan.nextInt();

        System.out.println(tamsayi>0 ?
                tamsayi%2==0 ? "Cift Sayi"
                        :"Cift sayi degil!"
                : tamsayi<=-100 && tamsayi>=-1000
                ? "3 basamakli"
                :"3 basamakli degil");

    }
}
