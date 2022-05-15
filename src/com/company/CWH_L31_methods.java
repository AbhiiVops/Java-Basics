package com.company;

public class CWH_L31_methods {

     static int logic(int x,int y){        // for creating methods
       // int logic(int x,int y) {           // if we dont use the static keyword then in that case we
                                           // need to create copy of all logics;  in simple language
                                           //  iss class ka object public static void main me bnana pdega
            int z;
            if (x > y) {
                z = x + y;
            } else {
                z = (x + y) * 5;
            }
           // x=456;
            return z;

        }

        public static void main(String[] args){
        int a= 7;
        int b=2;
        int c ;
        // below is the Method invocation without object creation;

            c = logic(a,b);    // agar ham public static void main me bina object me kch bhi call
                           // kr rhe hai bina object bnae to sirf ham static method hi call kr skte hai
                            // isliye upar me static keyword use krna zaruri hai i.e; static int logic

       //Method invocation using object creation
          //  CWH_L31_methods obj = new CWH_L31_methods();
          //  c=obj.logic(a,b);

            int a1=5;
        int b1=7;
        int d;
        d=logic(a1,b1);
      //      d=obj.logic(a1,b1);

            System.out.println(c);
            System.out.println(d);




    }
}
