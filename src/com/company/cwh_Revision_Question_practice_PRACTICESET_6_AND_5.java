package com.company;

import java.util.Scanner;

public class cwh_Revision_Question_practice_PRACTICESET_6_AND_5 {
    public static void main(String[] args) {

        //Practice set -5 - Q1
        // Question 1 to print "*"
       /*
        for(int i=4;i>0;i--)    {
            for(int j=0;j<i;j++)  {
                System.out.print("*");

            }
            System.out.print("\n");
        }
*/

  //  Practice set - 6 - Q1 to Q8
        // Question 1
  /*
        float value[] ;
        value = new float[5];
        value[0] = 1.29f;
        value[1] = 5.2f;
        value[2] = 98f;
        value[3] = 100.69f;
        value[4] = 15.2f;

        float  sum =0;
        for(int i=0; i<value.length;i++)   {

            sum = sum + value[i] ;

        }
        System.out.println("the sum of the given array: " + sum);

*/

         // question 2
/*
        boolean b1 = false;
        float n=45.2f;
        float  arr[] ={25.99f,45.2f,90f,78.2934f};
        for(float e:arr)   {
            if(n==e)  {
                b1 = true;
                break;
            }
        }  if(b1) {
            System.out.println("the integer is present in the array");
        } else {
            System.out.println("the integer is not present in the array");

        }
*/


        // Question 3:
/*
        float marks[] = {60f, 89f, 75f, 92f, 98f, 100f};
        float sum = 0;
        for (float elements : marks) {
            sum = sum + elements;
        }
        System.out.println("The avg. marks in physics is: " + sum/marks.length );
*/

  // Question 4

        /*
         int M1[][] = {{1,2,3},
                       {4,7,9}};
         int M2[][]= {{3,7,5},
                      {9,2,4}};
         int result[][] = {{0,0,0},
                           {0,0,0}};

         for(int i=0; i<M1.length;i++)           {
                   for (int j=0; j<M1[i].length;j++)  {
                       System.out.format("Setiing value for a=%d and b=%d\n", i,j);  // here the variable can be a,b, of anychoice
                       result [i][j] = M1[i][j] + M2[i][j];
                   }
         }
         for(int i=0;i<M1.length;i++)           {
             for(int j=0;j<M1[i].length;j++)  {
                 System.out.print(result[i][j] + " ");

             }
             System.out.print("\n");
         }
*/


        // Question 5
/*
        int arr[] = {2,4,9,8,5,6,13};
        int gif = Math.floorDiv(arr.length , 2 );
        int l= arr.length;
        int temp;
        for(int i=0;i<gif;i++)   {     // we need to run the loop upto the gif of array length/2

            temp = arr[i];
            arr[i]  = arr[l-1-i];
            arr[l-i-1] = temp;

        }
        for(int e: arr)   {
            System.out.print(e + " ");
        }
*/

        // question 6
/*
        int ele[]= {2,56,78,92,399};
        int max= Integer.MIN_VALUE; // or i can write max=0
        for(int e:ele)  {
            if (e>max) {
                max =e;
            }

            }
        System.out.println(max);

*/

      // Question 7:
       /*
        int values[]={772,990,72,91,-2};
        int min= Integer.MAX_VALUE;
        for(int e:values)  {
            if(e<min)  {
                min =e;
            }
        }
        System.out.println(min);
*/

        // Question 8
  /*
    int arr[] = {23,82,20,79,63};
    boolean IsAnArray = true;
    for(int i=0;i<arr.length-1;i++) {  // to see why arr.length see the video L-29 47:07
        if(arr[i] > arr[i+1])  {
            IsAnArray = false;
            break;

        }
    }
        if(IsAnArray) {
            System.out.println("The given array is sorted");
        } else {
            System.out.println("The given array is not sorted");
        }
*/

    //printing "*" using while loop
        // did't succeed to try 1 more time

//        int i=4;
//        int j=0;
//        while(i>0)  {
//
//            while(j<i)  {
//                System.out.print("*");
//                j++;
//
//            }
//          i--;
//            System.out.print("");
//        }


//        int i=10;
//        int j=1;
//        while (i<=1)
//        {
//            while (j<=10)
//            {
//                System.out.print("*");
//                j++;
//            }
//            i--;
//            System.out.println("");
//            j=1;
//        }


//        int i=1,j=1;
//        while(i<=10)
//        {
//            while(j<=10)
//            {
//                System.out.print("*");
//                j++;
//            }
//            i++;
//            System.out.println("");
//            j=1;
//        }













































































































































    }

}