package com.company;
import java.util.Scanner;

public class CWH_L20_Chapter4_Practiceset_ {
    public static void main(String[] args) {

        // QUESTION 1

//        int a = 10;
//        if(a=11)
//            System.out.println("i am 11");
//        else
//            System.out.println("I am not 11");

        // Question 2:

        Scanner sc = new Scanner(System.in);

       /*
        System.out.println("Enter your marks in physics");
        int M1 = sc.nextInt();

        System.out.println("Enter your marks in chemistry");
        int M2 = sc.nextInt();

        System.out.println("Enter your marks in maths");
        int M3 = sc.nextInt();

              float avg= (M1+M2+M3)/3f;
        System.out.println( "your overall percentage" + avg);

              if(avg>=40 && M1>=33 && M2>=33 && M3>=33){       // WE CAN WRITE THE CONDITIONS THIS WAY TOOO

                  System.out.println("Congratulations, you have been promoted");

              }  else {
                  System.out.println("you are fail");
              }
*/

// QUESTION 3


/*

        System.out.println("enter your income");
        int income= sc.nextInt();

        float tax1= (income-250000)* 5/100f;
        float tax2= (income-250000)* 20/100;
        float tax3 = (income-250000)* 30/100;

        if(income<=249999 )     {
    System.out.println("you don't need to pay tax");
}
 else if( income>=250000 && income<= 499999){
     System.out.println("you have to pay " + tax1 + "/-");

 } else if (income>= 500000 && income<= 999999){

     System.out.println("you have to pay " + tax2 + "/-");
 }
     else if(income >=1000000)
     {
         System.out.println("you have to " + tax3 + "/-");

        }

     else{
     System.out.println("you dont need to pay tax");

 }
*/


        // QUESTION 4

//        System.out.println("Enter no. between 1 to 7");
//        int day= sc.nextInt();
//
//        switch(day)
//         {
//            case 1:
//                System.out.println("MONDAY");
//                break;
//
//             case 2:
//                 System.out.println("TUESDAY");
//                 break;
//
//             case 3:
//                 System.out.println("WEDENESDAY");
//                 break;
//
//             case 4 :
//                 System.out.println("THURSDAY");
//                 break;
//
//             case 5:
//                 System.out.println("FRIDAY");
//
//             case 6:
//                 System.out.println("SATURDAY");
//                 break;
//
//             case 7:
//                 System.out.println("SUNDAY");
//                 break;
//
//             default :
//                 System.out.println("Invalid Argument");
//
//              }

          // question 4 can be solved by enhanced switch case too as given below
//
//        System.out.println("Enter no. between 1 to 7");
//             int day= sc.nextInt();
//
//             switch(day) {
//                 case 1 -> System.out.println("Monday");
//                 case 2 -> System.out.println("Tuesday");
//                 case 3 -> System.out.println("Wednesday");
//                 case 4 -> System.out.println("Thursday");
//                 case 5  -> System.out.println("Friday");
//                 case 6 -> System.out.println("Satuday");
//                 case 7-> System.out.println("Sunday");
//
//
//
//
//             }

                               // QUESTION 5

//        System.out.println("Enter year");
//        int year= sc.nextInt();
//
//        if(year %400 ==0  && year%4==0)    {
//            System.out.println("The year is a leap year");
//        }
//        else if(year %100 ==0) {
//            System.out.println("THE YEAR IS NOT A LEAP YEAR");
//
//        }

                        // QUESTION 6

        // here to write this program i have used string method i.e; str.endsWith("  ")
        System.out.println("Enter your website name");
        String str = sc.next();

        if(str.endsWith(".com")) {
            System.out.println("It is a commercial website");
        }
        else if(str.endsWith(".org")) {
            System.out.println("It is a organization website");
        }
        else if(str.endsWith(".in"))    {
            System.out.println(" it is an Indian website");
        }






























}


}