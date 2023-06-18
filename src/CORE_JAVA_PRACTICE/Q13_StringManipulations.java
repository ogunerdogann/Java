package CORE_JAVA_PRACTICE;

import java.util.Scanner;

public class Q13_StringManipulations {
    public static void main(String[] args) {

        /*
        1- Kullanicidan isim ve soyismini ayri ayri alin.
        Isim daha uzun ise isim ve soyisimi ilk harfleri büyük, kalanlari kücük seklinde yazdirin.
        Soyisim daha uzun ise ismi ilk harf büyük digerleri kücük, soyisimi ise tüm harfleri büyük olacak
        sekilde yazdirin.
         */

      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Lütfen isminizi giriniz: ");
      //  String isim = scan.nextLine();
      //  System.out.println("Lütfen soyisminizi giriniz: ");
      //  String soyisim = scan.nextLine();
      //  if (isim.length()>=soyisim.length()){
      //      System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase()+" "+
      //              soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyisim.length()).toLowerCase());
//
      //  } else if (isim.length()<soyisim.length()) {
      //      System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase()+" "+
      //              soyisim.toUpperCase());
      //  }
      //  else System.out.println("HATALI GIRIS!");

        /*
        2- Kullanicidan bir cümle alin
          - Cümlede 'ev' geciyorsa "home sweet home" yazdirin
          - Cümlede 'is' geciyorsa "calismak güzeldir",
          - Ikisini de iceriyorsa "Hem ev lazim hem is",
          - hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */

        //  Scanner scan = new Scanner(System.in);
        //  System.out.println("Lütfen bir cümle giriniz: ");
        //  String cumle = scan.nextLine();
        //  cumle = cumle.toLowerCase();
        //  if (cumle.contains("ev")){
        //      if (cumle.contains("is")){
        //          System.out.println("hem ev lazim hem is");
        //      }else System.out.println("home sweet home");
        //  }
        //  else if (cumle.contains("is")){
        //      System.out.println("calismak güzeldir");
        //  }
        //  else System.out.println("cok calisman lazim");


          /*
          3- Kullanicidan bir sifre isteyip asagidaki sartlari kontrol edinve kullaniciya
          düzeltmesi gereken tüm eksikleri söyleyin, eger tüm sartlari saglarsa, "sifre basariyla kaydedildi"
          yazdirin.
            - ilk harf kücük harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
           */

          Scanner scan = new Scanner(System.in);
          System.out.println("Lütfen belirleyeceginiz sifreyi giriniz: ");
          String sifre = scan.nextLine();
          int flag = 0;
          if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')){
              System.out.println("Sifrenizin ilk harfi kücük harf olmalidir!");
              flag++;
          }
          if (!(sifre.charAt(sifre.length()-1) >= 48 && sifre.charAt(sifre.length()-1) <= 57)) {
              System.out.println("Sifrenizin son karakteri rakam olmalidir!");
              flag++;
          }
          if (sifre.contains(" ")) {
              System.out.println("Siferiniz bosluk karakteri icermemelidir!");
              flag++;
          }
          if (sifre.length()<10) {
              System.out.println("Sifreniz en az 10 karakter icermelidir!");
              flag++;
          }
          if (flag == 0){
              System.out.println("Sifreniz basariyla kaydedilmistir!");
          }
          else flag =0;
    }
}
