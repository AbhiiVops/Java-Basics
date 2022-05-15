package com.company;

class Students {
    String name;
    int schoolid;
    int roll_no;

    public void PrintDetails() {
        System.out.println("My name is " + name);
        System.out.println("My school id is " + schoolid);

    }

    public int getRoll_no() {
        return roll_no;
    }

}

public class CWH_Custom_class_creation_REVISION {
    public static void main(String[] args) {

        Students anuradha = new Students();
        Students dipika = new Students();

        anuradha.name = "Anuradha bhattacharjee";
        anuradha.schoolid = 6231;
        anuradha.roll_no = 1;

        dipika.name= "Dipika bhattacharjee";
        dipika.schoolid = 7832;
        dipika.roll_no = 2;

        anuradha.PrintDetails();
        dipika.PrintDetails();

        int Roll = anuradha.getRoll_no();
        System.out.println("My roll no. is " + Roll);

        int Rolll = dipika.getRoll_no();
        System.out.println("My roll no. is " + Rolll);



    }
}
