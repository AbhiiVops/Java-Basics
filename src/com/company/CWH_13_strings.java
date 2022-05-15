package com.company;
import java.util.Scanner;


public class CWH_13_strings {
    public static void main(String[] args) {
//         String  name =  new String("Abhishek");         //first tarika
       // System.out.println(name);
//        String name = "abhishek";          // Another way of writing the string
//        System.out.println(name);

//        System.out.println("my name is "); // ways of printing a line
//        System.out.print("abhii");

        int a = 6;
        float b= 5.692535f;
        System.out.printf("the value of a is %2d and value of b is %9.4f", a,b);  //%d is called "format specifier" mainly for c programmers. // it can be in other way too checkout the video again for this
      //  System.out.format("the value of a is %d and value of b is %f", a,b );

        Scanner sc= new Scanner(System.in);
      //  String st = sc.nextLine();                    // we use sc.nextLine to print the whole sentence
      String st = sc.next();
        System.out.println(st);                    // it is used only to print the first word


    }
}
