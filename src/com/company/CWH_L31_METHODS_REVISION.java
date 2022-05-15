package com.company;

public class CWH_L31_METHODS_REVISION {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = (x * y) + 10;
        } else {
            z = (x * y) - 2;
        }
        x=4;
        return z;

    }

    public static void main(String[] args) {
        int a = 5;
        int b =40;
        int c;

        /*
        c =logic(a,b);               // method invocation without object creation
        System.out.println(c);
        */


        CWH_L31_METHODS_REVISION obj = new CWH_L31_METHODS_REVISION();    // public class me obj ek hi bar create krna hai

        System.out.format("The output value of a and b is: a=%d and b=%d\n" , a ,b);   // the value is not going to change even if we put some another value in the static int
                                                                                       // as only copy of a and b is initialized in x and y of static int

        c = obj.logic(a,b);                                               // Method invocation using object creation
        System.out.println(c);

        int a1 =200;
        int b1 =40;
        int d;

        /*
        d=logic(a1,b1);            // method invocation without object creation
        System.out.println(d);
        */

        System.out.format("The output value of a1 and b1 is: a=%d and b=%d\n" , a1 ,b1);     // the value is not going to change even if we put some another value in
                                                                                              // the static int  as only copy of a and b is initialized in x and y of static int

        d = obj.logic(a1,b1);           // Method invocation using object creation
        System.out.println(d);































































    }
}

