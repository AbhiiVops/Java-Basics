package com.company;

public class CWH_L28_Multi_dimensional_array_in_java {

    public static void main(String[] args) {

        // int [] marks  // A 1-D array

        // 2-d array

        int flats [][];
        flats = new int[2][3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;

        System.out.println("Displaying the given 2-D array");
        for(int i=0; i<flats.length;i++) {
            for(int j=0; j<flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }

            System.out.print("\n");


        }






    }
}
