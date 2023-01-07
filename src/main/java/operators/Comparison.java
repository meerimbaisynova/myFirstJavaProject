package operators;

public class Comparison {

    public static void main (String [] args){
        /*
        Comparison operators are <, >, <=, >=, ==
         */

        boolean b = 5 > 2;
        System.out.println(b);

        b = 5 < 2;
        System.out.println(b);

        /*
           == equals operators, compares 2 values if they are equal
         */

        b = 10 == 10;
        System.out.println("10 == 10: " + b);

        b = 10 == 5;
        System.out.println("10 == 5: " + b);

        /*
        >=, <=
         */

        b = 10 >= 5;
        System.out.println("10 >= 5: " + b);

        b = 100 >=-100;
        System.out.println("100 >=-100: " + b);

        b = 900 <= 90;
        System.out.println("900 <= 90: " + b);

        b = 900 >= 90;
        System.out.println("900 >= 90: " + b);
//        ===============

        boolean f = 10 > 1;

        System.out.println(10 > 1);


        int k = 50;
        int p = 1;

        System.out.println(k < p);
        System.out.println(50 < 1);

//        ==============================

        String str = "abc";
        String str2 = "name";

        System.out.println(str + str2);

        System.out.println(1 + 5);
        System.out.println(str + 1 + 5); //abc15

        String number = "12";
        String div = "6";

        System.out.println(number+div);

        System.out.println(1 + 2 + 1 + "some text");
        System.out.println(str + 1 + 2 + 1);
        System.out.println(2 + 3 + 5 + "some data" + 3 + 5 + 6);








    }
}
