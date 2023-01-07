package ifElseLogicalOperators;

public class ifElseRecap {
/*
You are driving a little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value:
0=no ticket, 1=small ticket, 2=big ticket.
If speed is 60 or less, the result is 0.
If speed is between 61 and 80 inclusive, the result is 1.
If speed is 81 or more, the result is 2.
Unless it is your birthday -- on that day, police will not
give you any ticket.
*/

    public static void caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <= 60) {
            System.out.println("no ticket");
        } else if (speed > 60 && speed <= 80 && !isBirthday) {
            System.out.println("you get small ticket");
        } else if (speed > 60 && speed <= 80 && isBirthday) {
            System.out.println("since it's birthday, no ticket");
        } else if (speed > 80 && !isBirthday) {
            System.out.println("you get big ticket");
        } else if (speed > 80 && isBirthday) {
            System.out.println("You are lucky, no big ticket since its your birthday");
        }
    }


    public static void main(String[] args) {
        caughtSpeeding(59, true);
        caughtSpeeding(70, false);
        caughtSpeeding(90, true);
        caughtSpeeding(81, false);

        System.out.println(love6(1, 4)); //false
        System.out.println(love6(3, 3)); //true
        System.out.println(love6(6, 0)); //true

        System.out.println(greenTicket(1, 1, 1)); //20
        System.out.println(greenTicket(1, 0, 1)); //10
        System.out.println(greenTicket(0, 0, 1)); //10
        System.out.println(greenTicket(0, 1, 2)); //0


    }

    /*
    The number 6 is a truly great number. Given two int values, a and b,
    return true if either one is 6.  Or if their sum is 6.

    love6(6, 4) → true
    love6(4, 5) → false
    love6(1, 5) → true
     */
    public static boolean love6(int a, int b) {

        if (a == 6 || b == 6 || a + b == 6) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Given three ints, a b c, return true if it is possible
    to add two of the ints to get the third.

    twoAsOne(1, 2, 3) → true
    twoAsOne(3, 1, 2) → true
    twoAsOne(3, 2, 2) → false
     */
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || c + b == a) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend) {
            if (cigars >= 40) {
                System.out.println("The party was successful on weekend");
                return true;
            } else {
                System.out.println("The party failed on weekend");
                return false;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println("Party was successful on weekday");
                return true;
            } else {
                System.out.println("Party failed on weekday");
                return false;
            }
        }


    }


    public static int greenTicket(int a, int b, int c) {
        return 0;
    }


}
