package com.company;

class Animal  {
    String n;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }


}
class Dog extends Animal   {
    String y;
    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }


}

class Base  {
   public  int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting value of x");
        this.x = x;
    }

    public void printMe()  {
        System.out.println("THIS IS A CONSTRUCTOR");
    }
}
class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_L45_Inheritance {
    public static void main(String[] args) {
        // Creating AN OBJECT OF BASE CLASS
  Base b1= new Base();
  b1.setX(4);    // HERE I CANT USE b1.getY as getY is not there in the Base class
  System.out.println(b1.getX());

  // CREATING AN OBJECT OF DERIVED CLASS
       Derived d= new Derived();
        d.setX(4);   //. here i can use the d.getX as it is derived class
        System.out.println(d.getX());
        d.setY(6);
        System.out.println(d.getY());

        // Quick Quiz

        Dog dog = new Dog();
        dog.setN("Sandy");
        System.out.println(dog.getN());
        dog.setY("Bhowww....bhoww..sandyyy");
        System.out.println(dog.getY());


    }
}
