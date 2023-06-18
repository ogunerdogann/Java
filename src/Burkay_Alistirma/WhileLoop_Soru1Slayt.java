package Burkay_Alistirma;

public class WhileLoop_Soru1Slayt {
    public static void main(String[] args) {

        //Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        //yazdirin.

        int baslangic=10;

        while (baslangic<100){
            if (baslangic%7==0){
                System.out.println(baslangic);
            }
            baslangic++;
        }

    }
}
