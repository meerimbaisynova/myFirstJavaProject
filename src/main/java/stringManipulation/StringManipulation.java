package stringManipulation;

import classesAndObjects.Animal;

public class StringManipulation {
    public static void main (String [] args){
        String name1 = "John";
        String name2 = "john";

        boolean isEqual = name1 == name2;
        System.out.println(isEqual);

        String city1 = "Chicago";
        String city2 = "Chicago";
        isEqual = city1 == city2;
        System.out.println("Chicago == Chicago: "+ isEqual);

        String newCity = new String("Chicago");
        isEqual = city1 == newCity;
        System.out.println("Chicago == new Chicago: " + isEqual);
//=======================

        String cake1 = "honeycake";
        String cake2 = "cheesecake";
        String cake3 = "HoneyCake";
        String cake4 = "cheesecake";
        String cake5 = new String("cheesecake");

        boolean isSameCake = cake1 == cake2;
        System.out.println("honeycake is same as cheesecake: " + isSameCake);

        isSameCake = cake1 == cake3;
        System.out.println("honeycake is same as HoneyCake: " + isSameCake);

        isSameCake = cake2 == cake4;
        System.out.println("cheesecake is same as cheesecake: " + isSameCake);

        isSameCake = cake4 == cake5;
        System.out.println("cheesecake is same as cheesecake: " + isSameCake);

//        ============== equals() method from String class
        // it only compares values
        // it can be used by String only
        // it is a method returns boolean: true or false

        isSameCake = cake4.equals(cake5);
        System.out.println(isSameCake);

        System.out.println("USA".equals(new String("USA")));
        System.out.println(" hello Codewise".equals("hello Codewise"));

        String animal = "elephant";
        System.out.println(animal.equals("animal"));

        String animal2 = "lion";
        System.out.println(animal2.equals("Lion"));

        String animal3 = new String("Lion");
        System.out.println(animal2.equals(animal3));

        System.out.println(animal3.equals("Lion"));

        System.out.println(animal2 == "lion");

        String animal4 = new String("lion");

        System.out.println(animal2 == animal4);

        //What is a difference between .equals and ==

        int a = 3;
        int b = 2;
        int c = 3;

        boolean isEq = a == b;
        isEq = a == c;


































    }
}
