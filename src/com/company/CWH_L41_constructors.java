package com.company;

class MyMainEmployee  {
    private int id;
    private String name;

    public MyMainEmployee()  {    // here instead of initializing chnaging the data we
                                  // can make a public methods class and when we create
                                  // an object of that group it will automatically get invoked
        id = 45052;
        name = "Your-name-here";
    }

    public MyMainEmployee(String myName)  {
        name = myName;
    }

    public MyMainEmployee(String myName , int myId)  {
       name = myName;
        id = myId;
    }


    public String getName()  { return name; }
   // public void setName(String n)   { name = n; }
    public int getId()  { return id; }
//    public void setId(int y)   { id = y; }


}

public class CWH_L41_constructors {
    public static void main(String[] args) {

      //  MyMainEmployee abhii= new MyMainEmployee();
      //  MyMainEmployee abhii= new MyMainEmployee( "Abhishek");  // we can do constructor overloading too
        MyMainEmployee abhii= new MyMainEmployee( "Abhishek" , 5050);  // we can do constructor overloading too
//        abhii.setName("Abhishek");
      System.out.println(abhii.getName());
//
//        abhii.setId(4050);
       System.out.println(abhii.getId());



    }
}
