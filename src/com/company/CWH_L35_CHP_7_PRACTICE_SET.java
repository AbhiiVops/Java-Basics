package com.company;

public class CWH_L35_CHP_7_PRACTICE_SET {

    // question 1 :
  /*
    static void product(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);

        }

    }
*/

    // question 2 :
/*
    static void pattern()  {
        for(int i=0;i<4;i++)   {
          for(int j=0;j<=i;j++)  {
                System.out.print("*");
            }
            System.out.print("\n");
    }
*/

    // Question 3

    // sum(n) = 1+2+3+5+6+7+8+9..........+ n-1 +n
    // sum(n) = sum(n-1) + n

    // in the given question if we take sum(3) it will break like this :
    // sum(3) = 3 + sum(2);
    // sum(2) = 3+2+sum(1);
    // sum(1) = 3+2+1;

    /*
    static int sum(int n)    {
       // Base condition
        if (n ==1)  {
            return 1;
        }
        else  {
               return n + sum(n-1);
        }

    }
*/

    // question 4
/*
    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

*/

           // question 5

    // fibonacci series = 0,1,1,2,3,5,8,13,........(n-2)+(n-1)+(2n-3)+(3n-4)
/*
    static int fib(int n)   {
        if(n==1)  {
            return 0;
        }
        else if(n==2)  {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
*/

    // question 6

    /*
    static int avg(int ...arr)   {
        int result =0;
        for( int e:arr)   {
            result += e;
        }
        return result;
    }
*/

    // question 8

    /*
    static void pattern3(int y) {
        if (y>0) {
            pattern3(y-1);
            for(int i=0;i<y;i++) {
                System.out.print("*");
            }
            System.out.println();      // this is for printing new line
        }
    }
    */

    // this program will run in the following manner;
//    pattern3(3)
//    pattern3(2) + 3 times star and  new line
//    pattern3(1) + 2 times star and 1 new line + 2 time star and 1 new line

    // question 7
/*
    static void pattern4(int z)   {
        if (z>0) {
            for(int i=z;i>0;i--) {
                System.out.print("*");
            }

            System.out.println();              // this is for printing new line
            pattern4(z-1);
        }
    }

 */

    // question 9
/*
    static int temp_c(int value)   {
        return  (9/5*value)+32;
    }
*/

    // question 10

    /*
    static int sumI_ite(int n)  {
        int sum=0;
        if(n==0)  {
            return 0;
        }
        else {
            for(int i=1;i<=n;i++)
                 sum += i;
        }
        return sum;
    }
*/


    public static void main(String[] args){
   //  product(5);                             // question 1

  //   pattern();                              // question 2

   //     int c = sum(4);                   // question 3

     //   System.out.println(c);
     //   pattern2(5);                    // question 4

//  int result = fib(8);                  // question 5
//        System.out.println(result);

     //   System.out.println("Average of the given numbers is: " + (avg(5,6,8,50,60,45)/2));    // question 6

     //   pattern3(5);                 // question 8

      //   pattern4(20);                 // question 7

//         int c = temp_c(0);        // question 9
//        System.out.println(c);

//        int d = sumI_ite(4);               // question 10
//        System.out.println(d);

    }

}



