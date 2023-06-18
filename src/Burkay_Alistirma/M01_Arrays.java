package Burkay_Alistirma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class M01_Arrays {
    public static void main(String[] args) {

        //For you to do:
        //	Write a program that creates an array of integers that stores the following values: 45, 78, 12,  67, 55
        //	and then prints all array values.
        //	Output:	45 78 12  67 55


       // int[] dizi = {45, 78, 12, 67, 55};
       // System.out.println(Arrays.toString(dizi));
       // for (int i = 0; i < dizi.length; i++) {
       //     System.out.println(dizi[i]);
       // }


        //For you to do:
        //	Write a program that creates an array of integers that stores the following values:
        //	45,78, 12,  67, 55, 89, 23, 77, 88
        //	Print only values that stored with even index including 0.
        //	Output:	45 12 55 23 88

        //int[] dizi = {45,78,12,67,55,89,23,77,88};
        //for (int i = 0; i <= dizi.length ; i=i+2) {
        //    System.out.print(dizi[i]+" ");
        //}


        //For you to do:
        //	Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
        //	and prints the values starting at index 0 and multiple of 2 using a for loop.
        //	Output:	syntax

      //  char[] dizi = {'s', 'a', 'y', 'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
      //  for (int i = 0; i < dizi.length; i=i+2) {
      //      System.out.print(dizi[i]+" ");
      //  }


        //For you to do:
        //	Write a program that creates an array of strings with the following
        //	values{"This", "is", "array", "of", "strings"} and prints all values in one line.
        //	Output:	This is array of strings

      //  String[] dizi = {"This", "is", "array", "of", "strings"};
      //  for (int i = 0; i < dizi.length; i++) {
      //      System.out.print(dizi[i]+" ");
      //  }

        //For you to do:
        //	Write a program that creates an array of strings with the size being 7.
        //	Ask the user to input Days of a week beginning with Sunday using Scanner class.
        //	Add these inputs to your array and then print all values from that array

        //	Example:
        //	Please enter day 1 of the week
        //	Sunday
        //	Please enter day 2 of the week
        //	Monday
        //	Please enter day 3 of the week
        //	Tuesday
        //	Please enter day 4 of the week
        //	Wednesday
        //	Please enter day 5 of the week
        //	Thursday
        //	Please enter day 6 of the week
        //	Friday
        //	Please enter day 7 of the week
        //	Saturday
        //Hint: you will need 2 for loops but it is not nested loops.

      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Please input day of the week");
      //  String[] dizi2 = new String[7];
      //  String day = "";
      //  for (int i = 0; i <7 ; i++) {
      //      System.out.println("Please enter day "+(i+1)+" of the week");
      //      day = scan.next();
      //      dizi2[i] = day;
      //  }
      //  for (int i = 0; i <dizi2.length ; i++) {
      //      System.out.print(dizi2[i]+" ");
      //  }

        //For you to do:
        //	Note: Create Scanner class
        //	Write an array with size of 5.
        //	Use a loop to input values to the array (don't print any prompt message for Scanner).
        //	Then print out all the elements you have created in the first loop in reverse order.
        //	Example:
        //	Input:
        //	1
        //	2
        //	3
        //	4
        //	5
        //	Output:
        //	5
        //	4
        //	3
        //	2
        //	1

        Scanner scan = new Scanner(System.in);
        int[] dizi = new int[5];
        int[] dizi2 = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = scan.nextInt();
        }
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.println(dizi[i]);
        }
    }
}
