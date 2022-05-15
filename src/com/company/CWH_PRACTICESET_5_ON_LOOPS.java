package com.company;
import java.util.Scanner;

public class CWH_PRACTICESET_5_ON_LOOPS {

    public static void main(String[] args) {

                    //   Question 1



        // didn't get the logic of question    // okayyy i got the logic

//        int n=4;
//        for(int i=n; i>0; i--)   {
//            for(int j=0 ;j<i;j++)  {
//                System.out.print("*");
//            }
//            System.out.print("\n");




                 // question 2

//
//
//
//        int times = 10;
//        int i=0;
//        while(i<times)   {
//            i++;
//        }  System.out.println("sum is " + times*(times+1) );




        // question 3

       Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. for multiplication table: ");
        int value= sc.nextInt();

        for(int i=1; i<=10;i++) {

         //  System.out.println(value + 'x' + i + " = " + (value * i));    // this way is wrong;
           // System.out.printf("%d x %d = %d\n", value ,i , value*i );
            System.out.println(value*i);

        }




        // question 4

        // using for loop



//        int n=10;
//        for(int i=10; i!=0; i--)    {
//            System.out.println(n*i);
//        }

        // using while loop

//        int n=10;
//        int i=1;
//        while(i<11)    {
//            System.out.println(n*i);
//            i++;
//        }




        // using do-while loop


//
//        int n=25;
//        int i=1;
//        do {
//            System.out.println(n*i);
//            i++;
//
//        }  while(i<=10);





        // question 6



//        System.out.println("Enter a no.");
//        int fac= sc.nextInt();
//    int factorial = 1;
//        for(int i=fac; i>0;i--)    {
//            factorial *= i;
//
//        }
//        System.out.println(factorial);



                     //  question 5




//        System.out.println("enter a no.");
//        int sac= sc.nextInt();
//        int factorial=1;
//        for (int i=sac;i>0;i--)   {                  // this will print the no. in reverse order
//            factorial *= i;
//        }
//        System.out.println(factorial);




        // using dop-while loop

//        int value=5;
//        int i=1;
//        int factorial =1;
//        do  {
//            System.out.println(i);
//            factorial *= i;
//            i++;
                               // factorial *= i;              // by writing these statement here i am getting my answer as 720 why?   //
                                                             //okay i got the logic




//        }  while(i<=value);
//        System.out.println(factorial);




        // Question 6


        /*
        int value = 5;
        int factorial = 1;
        int i=1;
        while (i<=value)      {
          factorial *= i;
          i++;
        }
        System.out.print(factorial);
*/



        // question 7

        System.out.println("Printing using while loop");
      //  int value=4;
        int i=4;
        int j=0;
        while(i>0) {

            while (j < i)    {

                System.out.print("*");

                j++;

            }
            i--;
            System.out.print("\n");



        }




        // using for loop just for my practice

//        int value=4;
//          for(int i=4;i>0;i--) {
//              for(int j=0;j<i;j++)  {
//                  System.out.print("*");
//              }
//
//              System.out.print("\n");
//          }


//        int n=4;
//        int i =0;
//        int j =0;
//        while(i<=n) {
//            i++;
//            while (j < i) {
//                System.out.print("*");
//                j--;
//
//            }
//
//        }
//        System.out.print("\n");




        // question 9



//        int sum=0;
//        int n=8;
//        for(int i=1; i<11;i++)   {
//             sum = sum + n*i ;
//        }
//        System.out.println(sum);




         //   Question 11    // question 2 using for loop



//       int value = 5;
//        for(int i=0;i<=value;i++)    {
//
//        } System.out.println(value*(value+1));





        // Using do while loop




//        int value=5;
//        int i=0;
//        int sum=0;
//        while(i<=value)   {
//            sum = sum + (2*i);
//            i++;
//
//
//        }  System.out.println(sum);

























































    }
}
