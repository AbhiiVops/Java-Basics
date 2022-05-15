package com.company;

public class CWH_L33_VarArgs {
 /*
   static float sum(int a, int b)  {
        return a+b;
    }

    */

//    static float sum(int a, int b) {
//        return a + b;
//    }
//    static float sum(int a, int b , int c) {
//        return a + b+c;
//    }
//    static float sum(int a, int b , int c, int d) {
//        return a + b+c+d;
//    }
// but this is very lengthy . we dont need to create this much of methods.
    // for this we use VarArgs

    static int sum(int x ,int ...arr)  {
        // available as int[] arr;
        int result =x;
        for(int b: arr) {
            result += b;
        }

       return result;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tutorial");
        System.out.println("The sum of two no. is " + sum(5));   // it will return an empty array and answer will ne 0
        // in above case since we have added int x to static and 1 argument should  compulsarily needs be added or it will give error
        System.out.println("The sum of two no. is " + sum(50,90));
        System.out.println("The sum of three no. is " + sum(50,90, 85));
        System.out.println("The sum of 4 no. is " + sum(50,90, 85,45));
        System.out.println("The sum of 5 no. is " + sum(50,90, 85,45,93));
        System.out.println("The sum of 6 no. is " + sum(50,90, 85,45,789,427));
        System.out.println("The sum of 7 no. is " + sum(50,90, 85,45,982,89));


    /*    int x=60;
        int y=45;
        float c;
         c=sum(x,y);
        System.out.println(c);
*/










    }





}



