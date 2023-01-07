package stringManipulation;

import recap.Test;

public class Contains {
    public static void main (String [] args){
        /*
        contains() method comes from String class, and
        can only be used by String
        it checks if one string contains another string
        returns boolean: true or false
         */

        String slogan = "Chicago is a windy city";
        String city = "Chicago";

        boolean doesItContain = slogan.contains(city);
        System.out.println(doesItContain);

        doesItContain = slogan.contains("windy");
        System.out.println(doesItContain);

        doesItContain = slogan.contains("win");
        System.out.println(doesItContain);

        doesItContain = slogan.contains("Chicago city windy a is");
        System.out.println(doesItContain);


        String company = "GOOGLe";
        String website = "google";

        boolean b = company.contains(website); //false
        System.out.println("boolean b: " + b);

        b = company.contains(website.toUpperCase());
        System.out.println(b); //GOOGLe == GOOGLE

        b = company.toLowerCase().contains(website);
        System.out.println(b);

//        =============

        Test myObject = new Test();
        myObject.printAmericanFlag(2);

        String str1 = "Meerim";

        //        M
        char c = str1.toUpperCase().charAt(str1.length()-1);
        System.out.println(str1.substring(0, str1.length()-1) + (str1.charAt(str1.length()-1)+"").toUpperCase());


















    }
}
