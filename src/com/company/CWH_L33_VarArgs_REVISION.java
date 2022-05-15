package com.company;

public class CWH_L33_VarArgs_REVISION {

    static void statment() {
        System.out.println("Welcome to the VarArgs");
    }

    // below we are adding arguments everytime so we are making overloading the function everytime
    // but if we need to pass 1000 argument it will not be a optimal approach
    // for that we use VarArgs:

    /*
    static int sum(int a, int b)  {
        return a+b;

    }

    static int sum(int a, int b, int c)  {
        return a+b+c;

    }

    static int sum(int a, int b, int c, int d)  {
        return a+b+c+d;

    }
*/

    static int sum(int x, int ...arr) {      //  now it is must to give atleast one argument otherwise it will throw an error

    //    static int sum(int ...arr)  {
    int result = 0;
        for(
    int e:arr)

    {
        result += e;

    }
        return result;
    //  }

}
    public static void main(String[] args) {

      //  System.out.println("The sum of the array is: " + sum());  // since we have passed no arguments it will be an EMPTY ARRAY and in this case it will return 0
        System.out.println("The sum of a and b is: " + sum(5,6));
        System.out.println("The sum of a,b and c is: " + sum(5,6, 81));
        System.out.println("The sum of a,b,c and d is: " + sum(5,6,87,100));

        // if we want that compulsarily one input must be given then in that case we use the the concept of bars

        System.out.println("The sum of the array is: " + sum(4));   // now it is must to give atleast one argument otherwise it will throw an error






    }
}
