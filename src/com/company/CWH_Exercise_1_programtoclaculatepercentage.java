package com.company;

import java.util.Scanner;


public class CWH_Exercise_1_programtoclaculatepercentage {
    public static void main(String[] args) {

        System.out.println("WELCOME TO MAUT KA KHEL");
        System.out.println("Apne sahi marks enter karo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your physics marks : ");
        float M1 = sc.nextFloat();
        System.out.println("Enter your chemistry marks:");
        float M2 = sc.nextFloat();
        System.out.println("Enter your maths marks");
        float M3 = sc.nextFloat();
        System.out.println("Enter your English marks");
        float M4 = sc.nextFloat();
        System.out.println("Enter your hindi marks");
        float M5 = sc.nextFloat();
//        float totalmarks = M1 + M2 +M3 + M4 +M5;
//        System.out.println(totalmarks / 500* 100);

        float percentage = (M1 + M2 +M3 + M4 +M5)/500*100;
        System.out.println("Your percentage is " + percentage);


    }



}
