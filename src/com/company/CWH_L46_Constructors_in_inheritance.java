package com.company;

class Base1  {
    int x;

    public Base1() {
        System.out.println("Mai ek constructor hoon");

    }

    public Base1(int x) {       // constructor overloading
        System.out.println("I am an overloaded constructor with value of x as:" + x);  // BY DEFAULT WHEN WE CALL THE
        // DERIVED CLASS BY CREATING AN OBJECT THEN BY DEFAULT IT WILL PRINT THE WITHOUT ARGUMENT CLASS OF BASE
        // AND NOT THE CLASS WITH THE ARGUMENT.

    }

}
class derived1 extends Base1 {

    public derived1()  {
       // super(0);    // if we wish to call the base class constructor which has argument then we use the
         // super keyword
        System.out.println("Mai derived class ka constructor hoon");
    }


    public derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded derived constructor with value of y as:" + y);

    }
}

class ChildOfDerived extends derived1 {
        ChildOfDerived()  {
            System.out.println("I am a child of derived constructor");

    }
    ChildOfDerived(int x,int y, int z)  {
            super(x,y);
        System.out.println(" I am an overloaded constructor  of derived with value of z as :" + z);
    }



}

public class CWH_L46_Constructors_in_inheritance {
    public static void main(String[] args) {

    //    Base1 b=new Base1();
        //derived1 d = new derived1();  // by creating a derived class of the base class
                                      // we can call the constructor of the base class
                                      // and if we create a constructor in the derived class
                                      // the first constructor of base class will bne executed and then the
                                      // derived class constructor

       // derived1 d1 = new derived1(14,15);  // in this case it will first print the base class argument
                                                      //constructor and then the derived class argument constructor

       // ChildOfDerived cd = new ChildOfDerived();
       ChildOfDerived cd = new ChildOfDerived(10,20,30);

    }
}



