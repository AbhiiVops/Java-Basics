package com.company;

public class CWH_14_stringmethods {
    public static void main(String[] args) {
        // String A = new String("abhishek");
        // System.out.println(A);                      // if i write System.out.println("A") it will print A

//        String str = "abhishek";
//        System.out.println(str);

//        String str = "abhishek";
//        int value = str.length();      // this is used to find the length of the string
//        System.out.println(value);

//         String name = "DiPIkA";
//         String value = name.toLowerCase();   //THIS IS USED TO CONVERT THE STRING TO LOWER CASE
        //   System.out.println(name.toLowerCase());    //WE CAN PRINT IN THIS WAY TOO

//        System.out.println(value);

//        String name = "Anuradha";
//        String value = name.toUpperCase();      //this is used to convert lowercase to uppercase.
//        System.out.println(value);
//
//        String nonTrimmedString= "    ABhishek     ";
//        System.out.println(nonTrimmedString);
//        System.out.println(nonTrimmedString.trim());

       //  String name = "kanchan";
//        System.out.println(name.substring(0));    // 5. this will print the string from the given index number to end
        //System.out.println(name.substring(0,4));    // 6. this will print the string start string not the end string

        //String str = new String("Abhishek");
        // System.out.println(str.replace('e','a'));    // this will replace the word
        // System.out.println(str.replace("Abh", "ier"));
        // System.out.println(str.replace("k", "opr"));

//String Str= new String("rahul");
        // System.out.println(Str.startsWith("rah"));
        // System.out.println(Str.startsWith("rab"));      // here string is returning a boolean value

//String name = "abhishek";
        //System.out.println(name.endsWith("ek"));

        //   String name = "abhishek";
        //  System.out.println(name.charAt(5));   // 10. it checks the character on a particular given index

    //    String name = "abhishekshekshek";
 //       System.out.println(name.indexOf("his"));   // it reutrns the first occurence of the string/character;

      //  System.out.println(name.indexOf("shek",3));
          // System.out.println(name.indexOf("rryy", 9)); // if we write the wrong input it will return -1


         //System.out.println(name.lastIndexOf("e"));
        // System.out.println(name.lastIndexOf("shek", 11 ));

 String name= "abhishek";
          System.out.println(name.equals("Rahul"));   // this will consider the case also so to check we will consider the case of characters

          System.out.println(name.equalsIgnoreCase("Abhishek"));  // this will ignore the case of characters

        System.out.println("I am escape sequence \t double quote");


    }
}