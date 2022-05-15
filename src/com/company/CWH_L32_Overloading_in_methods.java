package com.company;

public class CWH_L32_Overloading_in_methods {

    static void foo() {
        System.out.println("Good morning bro!");
    }

    static void foo(int a) {             // ( a) is called the parameter
        System.out.println("Good morning " + a + " Bro");
    }
    static void foo(int a,int b) {             // ( a and b) is called the parameter
                                               // it will get a value then we will call it as argument
                                                // in software industry parameter and argument is interchangebly used
        System.out.println("Good morning " + a + " Bro");
        System.out.println("Good morning " + b + " Bro");

    }

    // CASE1: CHANGING THE INTEGER
//    static void change1(int a)  {
//        a=98;
//    }

    // CASE 2: CHANGING THE Array
//   static void change2(int arr[]) {
//       arr[0]= 98;
//   }

    // THIS IS THE CASE WHEN IT WILL RETURN NOTHING
//    static void tellJoke()  {
//        System.out.println("I invented a new wor\n" + "Plagiarism");
//
//
//    }

    public static void main(String[] args) {    // program invocation starts here
        // tellJoke();  // we are calling the function by doing so

        // changing the array
//        int marks[] = {52,73,77,89,95};
//        change2(marks);
//        System.out.println("The value  of marks[0] after running change is: " + marks[0]);

        // Case 1 : changing the integer
        // int x =45;
        //   change1(x);      // here the value of x is not going to change cuz copy of x has been copied to a
        //  System.out.println("The value after running is: " + x);


        // Method overloading
        foo();
        foo(4000);   //4000 is the argument
        foo(4000,5000);
        // Arguments are actual!

    }


}
