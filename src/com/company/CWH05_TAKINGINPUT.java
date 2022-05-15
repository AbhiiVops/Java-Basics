package com.company;
import java.util.Scanner;


public class CWH05_TAKINGINPUT {
    public static void main(String[] args) {

        //System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter 1st number");
//               int a = sc.nextInt();
//        System.out.println(" enter 2nd number");
//        int b = sc.nextInt();
//      int sum = a + b;
//        System.out.println(" the sum of the  no. is: " + sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);


    }
}
