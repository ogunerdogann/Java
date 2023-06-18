package day15_doWhileLoop_Scope;

public class S01_DoWhileLoop_Soru1_Slayt {
    public static void main(String[] args) {

        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char harf1 = 'k';


        do {

            System.out.print(harf1+" ");
            harf1++;

        }
        while (harf1>'k' && harf1<='t');

    }
}
