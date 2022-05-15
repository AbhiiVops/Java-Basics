package com.company;
import java.util.Scanner;

public class CWH_L21_LOOP_CONTROL_INSTRUCTION {
    public static void main(String[] args) {
  /*      System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        // instead of writing sout everytime , we can use loops

                         // WHILE LOOP     // it is generally used  when we dont know where the loop will end


        System.out.println("Using loops");
        int i=1;
        while(i<=3)   {
            System.out.println(i);
            i++;
        }

*/
                         // while loop can be used for boolean too as guven below:

//        while(true) {
//            System.out.println("you go to hell");   // it will print infinitely
//        }

                        // Another way of using while loop
/*
        int a=16;
        while(true)  {
            System.out.println(a);
            a++;
            if(a>30)  {
                break;
            }
        }
        */

             //aliter (another way of writing the above code)

//        int a =23;
//        while(a<40)   {
//            System.out.println(a);
//            a++;
//
//        }

                       // QUICK QUIZ:
//
//       int i =100;
//        while(i<=200)   {
//            System.out.println(i);
//            i++;
//        }

                   // DO-WHILE LOOP      // ye loop bina condition check kiye andar ghus jata hai

//            int a = 24 ;
//            do {
//                System.out.println(a);
//                a--;
//            } while(a>=0);

                      // quick quiz      :: to print natural no. b/w 100 to 200

//        int a = 100;
//        do {
//            System.out.println(a);
//            a++;
//        } while(a<=200);


                      // FOR LOOP    // this loop  can be used when we know from where to where the program will run

//        for(int a=0; a<50; a++) {
//            System.out.println(a);
//        }

                      // Quick quiz
          // 2n = Even numbers
          // 2n + 1 = odd numbers

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter how many odd numbers you want?");
//                int times= sc.nextInt();
//        for(int i=0; i<times; i++)  {         // we can use boolean expresssion too for i<times;
//                                              // not in this question but for a random question
//            System.out.println((2*i)+1);
//        }

                      // DECREMENTING THE LOOP

//        for(int i=5; i>=0; i--)    {
//            System.out.println(i);
//        }

        System.out.println("enter the no.from where you want natural no.?");
        int nat= sc.nextInt();
        for(int i=nat; i>=1; i-- ) {
            System.out.println(i);
        }

    }


}
