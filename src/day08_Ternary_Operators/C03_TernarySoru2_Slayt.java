package day08_Ternary_Operators;

import java.util.Scanner;

public class C03_TernarySoru2_Slayt {
    public static void main(String[] args) {

       // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
       // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci kenari giriniz: ");
        int kenar1= scan.nextInt();
        System.out.println("Ikinci kenari giriniz: ");
        int kenar2= scan.nextInt();
        System.out.println("Ücuncü kenari giriniz: ");
        int kenar3= scan.nextInt();
        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0
                ? "Eskenar Ücgen"
                : "Eskenar Ücgen degil!!"); // daha düzenli yazdik!
    }
}
