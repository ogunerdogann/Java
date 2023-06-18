package day09_10_String_Manipulations;

import java.util.Scanner;

public class Soru2_Slayt {
    public static void main(String[] args) {

       // Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
       //         input1 : “15.30 €” , input2 : “11.40 €”
       // output : 36.70 €


        String input1= "15.30 €";
        String input2= "11.40 €";
        input1=input1.replaceAll("\\D",""); //1530
        input2=input2.replaceAll("\\D",""); //1140


        double inp1= Double.parseDouble(input1);
        double inp2= Double.parseDouble(input2);
        double toplam=inp1+inp2;

        System.out.println(toplam/100+" €");



    }
}
