package day13_Method_Olusturma;

import java.util.Scanner;

public class C01_methodOlusturma {
    public static void main(String[] args) {

        //String str="Java Candir";
        //str'i büyük harflere cevirin. str.toUpperCase() kullaniriz.
        // peki toUpperCase methodu yerine BüyükHarf methodu seklinde kendimiz yazsak nasil olur?
        // Iste bunlari ögrenecegiz. :)
        //str=str.toUpperCase(); //Ctrl' ye bas ve toUpperCase 'e tikla ve bu method icin yazilan kodlari gör.
        //Slayti okuyabilirsin güzel aciklamalar ve örnekler var!

       //Kullanicidan iki sayi alip toplamlarini yazdiran bir method olusturunuz.
       //Methodlari klasin icinde ancak main methodun disinda yazdiririz.

        ikiSayiTopla(); // methodu calistirmak icin cagirmamiz gerekir.
        //iki defa cagirirsak iki defa calisir

    }
    public static void ikiSayiTopla() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak üzere iki sayi giriniz: ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Iki sayinin toplami: "+(sayi1+sayi2));

    }

}
