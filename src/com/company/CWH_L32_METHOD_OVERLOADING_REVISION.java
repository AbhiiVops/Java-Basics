package com.company;



public class CWH_L32_METHOD_OVERLOADING_REVISION {
/*
    static void telljoke()   {
        System.out.println("I invented a new word\n" +
                           "Plagiarism");
    }
*/

    /*
    static void change1(int a)   {
         a =98;
    }
*/

    /*
    static void change2( int arr[])   {
        arr[0]=100;

    }
*/

    /*
    static void change3(int array[])  {
        array[3] = 35;
    }

*/

    // METHOD OVERLOADING

    // below with the same class name and different parameter(bracket ke andar wale ko parameters bolte hai)
    // we have done overloading

    static void foo()   {
        System.out.println("Good morning bro!");
    }

    static void foo(int a)  {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a , int b)   {
        System.out.println("good morning " + a + " bro!");
        System.out.println("good morning " + b + " bro!");
    }

    // here we can't change the return type of the same class, it will throw an error
   // static int foo(int a , int b)
    /*
    static int foo(int a , int b ,int c)// by changing the paramewter we can obviously change the return type
    static void foo(int a , int b ,int c)// we can now even wrtie void as the return type
 */

    public static void main(String[] args) {

  /*
        telljoke();  // invoking the function. it takes place form the main
                     // void return type can be called like this
                     // Infact every method can be called like this,if it has argument the we need to pass argument in that case
                     // and intellij idea will read it automatically
*/

        /*
     // CASE 1 : CHANGING THE INTEGER
        int x=20;     // HERE THE OBJECT IS PASSED TO THE change1
        change1(x);
        System.out.println("The value of X after change is: " + x);
*/

        /*
        // CASE 2: CHANGING THE VALUE OF THE ARRAY;
        int marks[]= {59,84,98,96,47};     // here the reference of the object will be passed to the static int(arr[])
                                           //  hence the actual value of the respective index will change according to the input value.
       change2(marks);
        System.out.println("The value of marks[0] after change is: " + marks[0]);
*/

        /*
            // 1 MORE EXAMPLE OF CASE 2:
        int value[] ={45,89,78,90,92,84,56};
        change3(value);
        System.out.println("The value of value[3] after change is: " + value[3]);
*/


        // METHOD OVERLOADING

       // below we have passed arguments (parameters ko jo value dete hai usse arguments kaha jata hai)
        // ARGUMENTS ARE ACTUAL!(i.e they have a numeric value

    foo();
    foo(3000);
    foo(4000,5000);   // here 4000 and 5000 are called arguments














    }


}
