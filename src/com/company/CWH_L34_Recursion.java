package com.company;

public class CWH_L34_Recursion {

    //  factorial(0) = 1
    // factorial (n) = n*n-1*.....1
       // factorial(5)= 5*4*3*2*1 = 120
    // factorial(n) = n* factorial(n-1)

    // solving using iterative approach

    static int factoriall(int y) {
        int product = 1;
        if (y == 0 || y == 1) {
            return 1;

        } else {

            for (int i = 1; i <= y; i++) {
                 product *= i;

            }

        }

        return product;
    }
  // solving using recursion
//    static int  factorial(int n) {
//        if ( n==0 ||n==1) {
//            return 1;
//        }
//        else {
//            return n*factorial(n-1);
//        }
//
//    }

    public static void main(String[] args) {

        // printing using recursion
//        int x=4;
//       System.out.println("the value of the factorial is: " + factorial(x));

        // printing using iterative approach;
//        int z=5;
//        System.out.println("the value of the factorial is: " + factoriall(z));

    }

}


