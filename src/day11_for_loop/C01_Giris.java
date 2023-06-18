package day11_for_loop;

public class C01_Giris {
    public static void main(String[] args) {

        //10 kere java candir yazdirin

        String str="Java Candir";
        for (int i=0; i<10;i++){

            System.out.println(i+" "+str);
        }

        System.out.println("===========");

        //50'den baslayip 100'e kadar (100 dahil)
        //  sayilari yan yana aralarinda bir bosluk olacak sekilde yazin.

        for (int i = 50; i <=100 ; i++) {
            System.out.print(i+" "); //println yazdirmadim ona dikkat!
        }

        System.out.println("=======================");

        //3 basamakli sayilardan 23 ile bölünebilenleri
        //yan yana, aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 100; i <1000 ; i++) {
            if (i%23==0){
                System.out.println(i+" ");
            }
        }
    }
}
