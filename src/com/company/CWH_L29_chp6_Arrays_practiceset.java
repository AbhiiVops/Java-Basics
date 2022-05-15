package com.company;
import java.util.Scanner;

public class CWH_L29_chp6_Arrays_practiceset {

    public static void main(String[] args) {

                     // Question 1:
       // System.out.println("Printing using for loop");
        float sum =0;
       float cat[] = {52.5f,85.2f,56.2f,36.4f,79.2f};
     for(int i=0;i<=cat.length-1;i++) {
      sum = sum + cat[i];

     }
       System.out.println(sum);

        // QUESTION 2:
     /*
        System.out.println("Printing using for loop");
         float num =36.4f;
         boolean IsInArray= false;
        float cat[] = {52.5f,85.2f,56.2f,36.4f,79.2f};
      for(float elements:cat) {
      if(num==elements)  {
          IsInArray= true;
          break;

      }

      }
        if(IsInArray)  {
            System.out.println("The integer is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }
*/

        // Question 3
/*
        Scanner sc = new Scanner(System.in);


        float marks[];
      float    sum=0;
        marks = new float[4];
        marks[0]=62f;
        marks[1]=85f;
        marks[2]=96f;
        marks[3]=98f;

        for(int i=0;i<=marks.length-1;i++)  {
            sum = ((sum + marks[i]));
        }
        System.out.println("AVERAGE MARKS IN PHYSICS IS " + sum/marks.length);
*/

        // QUESTION 4


//        int M1[][]= {{1,2,3},
//                      {4,5,6}};
//        int M2[][]= {{2,6,7},
//                     {3,7,1}};
//        int result[][]= {{0,0,0},
//                          {0,0,0}};
//
//        for(int i=0;i<M1.length;i++)   {              // row no. of times
//            for (int j = 0; j<M1[i].length;j++)      {  // coloumn no.of times
//                result[i][j] = M1[i][j] + M2[i][j];
//            }
//        }
//        for(int i=0;i<M1.length;i++) {              // row no. of times
//            for (int j = 0; j < M1[i].length; j++) {  // coloumn no.of times
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//                result[i][j] = M1[i][j] + M2[i][j];
//
//
//            }
//            System.out.print("\n");
//        }


        //  QUESTION 5

        // FOR THIS QUESTION FIRST WE NEED TO FIND THE GREATEST INTEGER FUNCTION OF X.

//        int n= Math.floorDiv(3,2);          // this is used for finding the GIF of a given no
                                              // in this case 3/2 = 1.5 and GIF of [1.5] is 1
//        System.out.println(n);
/*
       int arr[]= {1,2,3,4,5,6};
       int l=arr.length;
       int temp;
        int n= Math.floorDiv(arr.length,2);    // in this we will find the gif of  array length and 2
        for(int i=0; i<n;i++)   {               // we will run this loop upto n which is the gif of array length and 2
            //            //   Swap a[i] and a[l-1-i]
            // a  b temp
            // |4| |3|  ||
            // now we will write a program to swap the code;
            temp = arr[i];
            arr[i]= arr[l-1-i];
            arr[l-i-1] = temp;


        }
          for(int elements:arr)  {
              System.out.println(elements + "");
          }
*/

        // QUESTION 6

//        int arr[]= {1,2,3,455,4,5,6};
//        int max=0;
                                           // int max= Integer.MIN_VALUE;
                                        //  System.out.println(Integer.MIN_VALUE);
//        for(int e: arr)   {
//            if(e>max) {
//                max =e;
//            }
//        }
//        System.out.println("the maximum value maximum element is:" + max);

        //Question 7

//        int arr[] ={12,907,8585,90,2};
//        int min=Integer.MAX_VALUE;
//       // System.out.println(Integer.MAX_VALUE);
//        for(int e:arr)  {
//            if(e<min)  {
//                min = e;
//            }
//        }
//        System.out.println("The minimum value of the array is: " + min);

        //   QUESTION 8:

//        int arr[] ={12,907,8585,90,2};
//
//        boolean IsSorted =true;
//        for(int i=0;i<arr.length-1;i++)   {  // yaha pe loop 2 ke liye ni chlega for more info see the video
//            if(arr[i] >arr[i+1])  {
//                    IsSorted = false;
//                    break;
//            }
//        } if(IsSorted) {
//            System.out.println("The given Array is sorted");
//        }
//        else {
//            System.out.println("The given Array is not sorted");
//        }








































































































































































































    }

}
