package dataTypes;

import recap.Test;

import java.util.SortedMap;

public class Variables {

    public static void main (String [] args){

        System.out.println("My name is someone");


        // byte can store values from -128 to 127
        // i hate java

        byte a = 12;
        // System.out.println(a);

        byte b = 127;
       // System.out.println("first value of b: " + b);

        b = 23;
        // System.out.println(b);

        byte c = -128;

        // -------------------- SHORTS -----------------------//
        // -32768 to 32767

        short youngAge = 18;
        // System.out.println("my age is " + youngAge);

        youngAge = 12321;
        System.out.println("New age is " + youngAge);

        youngAge = 125;

        System.out.println("Another new age is " + youngAge);

        // ---------------- int ------------//
        // from -2,147,483,648 to 2,147,483,647

        int transactionID = 241345151;
        System.out.println("Transaction ID is: " + transactionID);

        transactionID = 111111111;

        int bankAccount = 111222;

        System.out.println("New transaction ID " + transactionID);

        System.out.println("My bank account number:" + bankAccount);

        bankAccount = 123456;

        // create new short, byte, int, long
        // print My short: value, my byte: value,

        long myLong = 1231241453;


        //============================================

        float degreeCelcius = 4333;
        double degreeFah = 101.8;
        double d = 2342;

     // ============ boolean only stores true or false

        boolean isLegal = true;

        System.out.println(isLegal);

        isLegal = false;
        isLegal = true;

        boolean isYoung;
        isYoung = false;

        System.out.println(isLegal);
        System.out.println(isYoung);

        //isYoung = true;
        isYoung = false;

        System.out.println("What will be here? " + isYoung);



        char letter = 'a';
        char digit = '3';
        char specCharacter = '?';

        letter = 'A';


        char num = 'B';
        char newNum = 'C';

        char w = '@';

//=============== String - the most common data type ===========//

        //int,long, char, boolean

        String name = "Codewise 2022 Batch 1! @codewiseacademy";

        System.out.println(name);


        String firstName = "Bena";
        String lastName = "Baialieva";

        System.out.println(firstName +  " " +  lastName);

        int age = 26;

        System.out.println("Hello my name is " + firstName + " " + lastName + ". I am " + age + " years old.");

        //BenaBaialieva

        String city = "Chicago";
        // Hello, my name is . I am from


        byte myByte = 12;
        int myInt = 23;
        double myDouble = 8989;

        String myName = "Benazir";
        String myCity = "Chicago";

        System.out.println("Hi " + myName + "Here is my byte " + myByte
                + " and here is my integer"
                + myInt);


        System.out.println("" + 2 + "   hello    " + 23);


        Test anyName = new Test();
        anyName.printAmericanFlag(2);


















    }


}
