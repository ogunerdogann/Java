package day08_Ternary_Operators;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*
        Ornek : Kullanicidan bir tamsayi alin.
Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
yazdirin
Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
uygun olani yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi= scan.nextInt();
        System.out.println(sayi>0 ? sayi%2==0
                ? "Sayi cift"
                :"Sayi tek"
                : -1000<sayi && sayi<-99
                ? "Sayi 3 basamakli"
                : "Sayi 3 basamakli degil!");

        /*
        Nested Ternary Operatörleri kod yazarken karmasik oldugu icin
        önerilmez ancak yazilan bir kodu okurken bilmemiz gerekebilir!
         */

    }
}
