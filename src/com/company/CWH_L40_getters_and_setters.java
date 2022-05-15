package com.company;

/*
class MyEmployee{
 private int id;
 private String name;

    public String getName()  {
        return name;
    }

 public void setName(String n)   {
     name = n;

 }

    public int getId()  {
        return id;
    }

 public void setId(int y)   {
     id = y;
 }

}
 */

class Circle {
    private double radius;

    public void setArea(int n) {
       this.radius =  3.14 * n * n;
    }
    public double getArea()  {
        return radius;
    }
    public void setPerimeter(int y) {
        radius = 2 * 3.14 * y;
    }

    public double getPerimeter() {
        return radius ;
    }

}



public class CWH_L40_getters_and_setters {
    public static void main(String[] args) {

      /*
        MyEmployee Abhii = new MyEmployee();
//         Abhii.id = 5206;
//         Abhii.name = "Abhishek";

        MyEmployee E1 = new MyEmployee();
        E1.setName("Abhishek");
        E1.setId(4505);
        System.out.println(E1.getId());
        System.out.println(E1.getName());
*/

        Circle C1= new Circle();
        C1.setArea(4);
        System.out.println(C1.getArea());
        C1.setPerimeter(14);
        System.out.println(C1.getPerimeter() );

    }

}
