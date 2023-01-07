package operators;

public class RecapOperators {
    public static void main (String [] args) {

        System.out.println("Hello Codewise!");

        String text = "Java programmer!";
        int num = 20;
        double d = 10.23;
        char c = 'j';
        char k = '&';

        byte b = 12;
        b = 11;
        b = 10;
        d = 3;


        String number = "23";

        int n = 20;
        double d2_7 = 30.5;

        d2_7 = n;

        System.out.println(d2_7);

        String secondText = "";

        int length=123;
        int width = 123;
        int perimeter = (length + width) * 2;

        System.out.println("The width of the square is: " + width);
        System.out.println("The length of the square is: " + length);
        System.out.println("The perimeter of the square is: " + perimeter);


        int result = 1 + 2;

//        result = result - 1;       +=, -=, /=, *=
        result-=1;

//        result = result * 2;
        result *=2;


        System.out.println(result);


        // LET'S PRACTICE COMPARISON OPERATORS

        boolean compare;

        compare = 3 == 5;
        /*
        = assign the value
        == compare, equals ?
         */
        System.out.println("3 == 5: " + compare);

        System.out.println("3 > 5: " + (3 > 5));

        System.out.println("3 < 5: " + (3 < 5));

        System.out.println("3 >= 5: " + (3 >= 5));

        System.out.println("3 <= 5: " + (3 <= 5));

        System.out.println("5 <= 5: " + (5 <= 5));


        /*
        == equals ?
        != not equal to ?
        */

        System.out.println("3 != 5: " + (3 != 5));

        int age = 30;
        int years = -30;

        boolean isTrue = age != years;

        System.out.println(isTrue);

        age = 5;
        years = 5;
        isTrue = age == years; //true

//        Meerim you have speaker issues

        int x = 10, y = 5;

//        int exp5 = (ye * (xe / ye + xe / ye));
//        int exp2 = (ye * xe / ye + ye * xe / ye);

        int exp1 = x / y;
        exp1 = exp1 + (x / y);
        exp1 = exp1 * y;

        int exp2 = y * x;
        exp2 = exp2 / y;
        exp2 = exp2 + exp2;

        System.out.println(exp1);
        System.out.println(exp2);

        double exp3 = (3.0 * 2 / 4);
        int exp4 = (3 * -2 % 4);

        System.out.println(exp3);
        System.out.println(exp4);

        int xe = 9, ye = 12, z = 3;

        int exp5 = xe - ye/3 + z * 2 - 1;
        int exp6 = (xe - ye)/3 + ((z * 2) - 1);

        System.out.println(exp5);
        System.out.println(exp6);

        int xd = 9,  yd = 12;
        int ad = 2,  bd = 4,  cd = 6;

//        int exp = (3 + 4 * xd)/5 - 10 * (yd - 5) * (ad + bd + cd)/xd + 9 *
//                (4/xd + (9 + xd)/yd);

        int exp = 3 + 4 * xd;
        exp = exp / 5;
        int tempInt = yd - 5;
        tempInt = tempInt * 10;
        exp = exp - tempInt;
        tempInt = ad + bd + cd;
        exp = exp * tempInt;
        exp = exp / xd;
        tempInt = 9 * (4/xd + (9 + xd)/yd);
        exp = exp + tempInt;

        System.out.println(exp);



        int year = 23;
        double yearDouble = 23;

        String yearText = "";

        // %

        // =, ==

        String str22 = new String ("Chicago");

        System.out.println(str22);





















    }
}