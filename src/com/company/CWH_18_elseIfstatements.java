package com.company;
import java.util.Scanner;

public class CWH_18_elseIfstatements {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = sc.nextInt();

        // else if statements
/*
        if(age>56){
            System.out.println("you are experienced");
        }
        else if(age>46){
            System.out.println("you are semi experienced");
        }
        else if(age>26) {
            System.out.println("you are semi-semi-semi experienced");
        }
        else{
            System.out.println("you are not eligible");
        }
        */

         // swtich case

        System.out.println("Enter your grade");
        char grade = sc.next().charAt(0);             // we can take inputs in char , int , string.

        switch (grade) {                               // to lear about enhanced switch from the leacture 18. was not able to find the option for enhanced keyword
            case 'A' :
                System.out.println("outstanding");
                break;

            case 'B':
                System.out.println("very good,keep learning");
                break;

            case 'C':
                System.out.println("improve more");

            case 'D':
                System.out.println("padhai chod do");

            default :
                System.out.println("you have entered wrong argument");

        }
        System.out.println("Thanks for using my java code");

    }
}
