package com.company;

// public class Employee       // this will throw an error as in one java program there
                                // can be only 1 public class
   class Employee{
int id;
int salary;
String name;
public void printDetails()  {          // Method formation
    System.out.println("My id is " + id);
    System.out.println("My name is "+ name);
    System.out.println("My salary is "+ salary);    // to add a salary attribute 1 way is to write like this
}
public int getSalary()  {       // we can create an another method like this
   return salary;
}
}


public class CWH_L38_Custom_Class_creation {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee Abhii = new Employee();   // Instantiating a new employee object
        Employee Dipika = new Employee();

       // Setting Attributes for Abhii
        Abhii.id = 201101;
        Abhii.salary = 350000;
        Abhii.name = "Abhishek";
        Dipika.id = 201123;
        Dipika.salary= 650000;
        Dipika.name = "Dipika";

        // Printitng the attributes
//        System.out.println(Abhii.id);       // instead of printing everytime lik this we can make a method and call it
    //    System.out.println(Abhii.name);


        Abhii.printDetails();                    // direct calling with methods creation
        Dipika.printDetails();

        int Salaryy= Abhii.getSalary();           // We can call by creating another method/function
        System.out.println(Salaryy);

        int Salaryyy = Dipika.getSalary();
        System.out.println(Salaryyy);
    }
}
