package com.company;

public class CWH_L34_Recursion_REVISION {

    // factorial(0) = 1
    // factorial(n)= n*(n-1)*......*2*1;
    // factorial(5)= 5*4*3*2*1;
    //factorial(n) = n*(n-1)            // factorial main formula

// recursion approach
    static int factorial_recursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n*factorial_recursive(n-1);
        }

    }

    // iterative approach


    static int factorial_iterative(int x) {
        int product =1;
        if (x == 1 || x == 0) {
            return 1;
        } else {
            for (int i = 1; i <= x; i++) {
                product *= i;

            }
        }
    return product;
    }

    public static void main(String[] args) {

        // printing using recursive approach
        System.out.println("The factorial of the given no is: " + factorial_recursive(8) );
        System.out.println("The factorial of the given no. is:" + factorial_iterative(5) );

    }

}
