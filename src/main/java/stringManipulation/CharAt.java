package stringManipulation;

public class CharAt {
    public static void main(String[] args) {

        /*
        charAt() method that returns char
        it belongs to String class, and can only be used by String
        it will return us the char of a index
         */

        String name = "Angelina";
        /*
        A = 0
        n = 1
        g = 2
        e = 3
        etc
         */

        char a = name.charAt(3); //return e
        System.out.println(a);


        String text = "Hello everyone! Hope you are doing well. " +
                "I wish you all good luck and at least 120k salary.";

        //==================== length() returns number of characters in the string
        // returns int and can be only used by String
        // is the only method that starts from 1

        System.out.println("the number of letters: " + text.length());

        String country = "USA";
        System.out.println(country + " has " + country.length() + " letters");

        country = "Mexico";
        System.out.println(country + " has " + country.length() + " letters");

        country = " Mexico ";
        System.out.println(country + " has " + country.length() + " letters");

        country = "Kyrgyzstan";
        System.out.println(country + " has " + country.length() + " letters");

        System.out.println(country.charAt(9));


        String school = "Harvard";
        String anotherSchool = "Stanford"; //8 letters
        /*
        S = 0
        t = 1
        a = 2
        n = 3
        f = 4
        o = 5
        r = 6
        d = 7
         */

        System.out.println(school.charAt(0));
        System.out.println(anotherSchool + "'s last letter is: " +
                        anotherSchool.charAt(anotherSchool.length() - 1)
                );


        /*
        length() returns int = length of String = number of letters
        charAt(int index) takes int value, and returns char


        m = 0
        a = 1
        m = 2
        a = 3

        mama.length() = 4

        charAt(2) = m
         */

        String cheers = "Congratistgadgnelkdfngselfkb sldnvs;nvksdnvsbbhb " +
                "bnslbvslkdnvlsnv " +
                "sdgnlkbnglerngrwlgm  afv adf sdeg";

        System.out.println(cheers + "'s last letter is " +
                cheers.charAt(cheers.length() - 1));

        System.out.println(cheers.length());

        String original = "Hello everyone, Let's do Java String exercises";
        int index = 10;

        System.out.println("The character at position" + index + "is "  + original.charAt(index));

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + (s1 == s2));





    }
}
