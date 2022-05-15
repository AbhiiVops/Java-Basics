package com.company;

class Sphere {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double Area()  {
        return 4*Math.PI*radius*radius;
    }
}

class Rectangle  {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4 ;
        this.breadth =5 ;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getArea() {
        return length*breadth;
    }
    public int getPerimeter()  {
        return 2*(length+breadth);
    }
}

class Cylinder {
   private int  radius;
    private int height;


    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea()  {
        return 2*Math.PI*radius*height;    // to get exact value of pi we can use
                                            // Math.PI instead of 3.14
    }
    public double volume()   {
        return Math.PI*radius*radius*height;
    }




}
public class CWH_L44_PRACTICESET_9_ACCESS_MODIFIERS {
    public static void main(String[] args) {

        // problem 1
        /*
        Cylinder c1= new Cylinder();
        c1.setHeight(9);
        System.out.println(c1.getHeight());
        c1.setRadius(12);
        System.out.println(c1.getRadius());
*/
        // problem 2
        /*
        Cylinder c1= new Cylinder();
        c1.setHeight(9);
        System.out.println(c1.getHeight());
        c1.setRadius(12);
        System.out.println(c1.getRadius());
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());
*/

        // problem 3
        Cylinder c1= new Cylinder(12,9);
//        c1.setHeight(9);
    //    System.out.println(c1.getHeight());
     //   c1.setRadius(12);
      // System.out.println(c1.getRadius());
        /*
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());
        */

        /// problem 4
//        Rectangle R1 =new Rectangle();
       /*
        Rectangle R1 =new Rectangle(5,6);  // we can alsa call like this
        System.out.println(R1.getBreadth());
        System.out.println(R1.getLength());
        System.out.println(R1.getArea());
        System.out.println(R1.getPerimeter());
    */

        // problem 5
        Sphere S1= new Sphere();
        S1.setRadius(5);
        System.out.println(S1.getRadius());
        System.out.println(S1.Area());

    }

}

