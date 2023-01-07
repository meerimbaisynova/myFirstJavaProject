package recap;

public class OperatorsRecap {

    public static void main (String [] args){

        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println(sum); //300

        sum = 20 + 300 + 10 - 30;
        System.out.println(sum); //300

        sum = a * b;
        System.out.println(sum); //20000

        System.out.println(sum / 1000); //20

     /*
     % - modulus - arithmetic operator that returns us
     the remainder after division
     10 / 3 = 3.33333
     3 + 3 + 3 + 1
     10 % 3 = 1;
     9 % 3 = 0;
      */

        int quantity = 1;
        int group = 20;
        System.out.println(quantity % group); //

        System.out.println(100 % 30);
        System.out.println(100 % 90);
        System.out.println(100 % 9);

        /*
        precedence specifies the manner in which operands
        are grouped together with operators
        priority:
        1) *, /, %
        2) -, +
        3)
         */
        // - 2 bil to 2 bil
        int x = 10;
        int y = 5;
        int z = 4;

        int result = x + y / y - z + x; //17
        System.out.println(result);

        System.out.println(10 * 5 / 2 - 5 * 4 / 5); //21

        result = 5 / 2;
        System.out.println(result); //2

        /*
        int, short, byte, long can only store whole numbers
         */

        System.out.println(100 / 30);
        System.out.println(9 / 2); //4.5
        System.out.println(9 % 2); //1
        System.out.println(15 / 4); //3

        /*
        float and double are primitive data types
        that can store fractional numbers
         */

        double d1 = 10.0;
        double d2 = 3;
        System.out.println(d1 / d2); //

        System.out.println(9.0 / 2.5);

        float f1 = 43565.9420f;
        float f2 = 124.42f;
        System.out.println("f1 / f2 = " + f1 / f2);

        //=========================

        System.out.println(1 + 2 + 3);
        System.out.println(1 + 2 + 3 + " this is text");
        System.out.println("this is text " + 1 + 2 + 3);

        //                   another text 18
        System.out.println("another text 1" + 2 * 4);
        System.out.println("new text" + 5 + 10 / 2 + 3 + 4 / 4);

        /*
        there are 6 comparison operators in java that return boolean value:
        true or false
        <,  less
        >,  more
        <=, less or equal
        >=, more or equal
        ==, equals
        !=  not equals
         */

        int i = 20;
        int j = 5;

        boolean bb = i > j;
        System.out.println(bb);

        bb = i < j; //false

        boolean bena = i <= j;
        System.out.println(bena); //false
        bena = i >= j; //true

        System.out.println(10 == 10); //true
        System.out.println(5 == 10); //false

        int k = 3;
        int l = 4;
        System.out.println(k = l);
        System.out.println(k);

        System.out.println(k == l); //true

        // one line comment

        /*
        multiple line comment
         */

        //   !=   not equals, returns true if operands are not equal
        //   and returns false if operands are equals

        int r = 9;
        int t = 10;
        System.out.println(r != t); //true
        System.out.println(r == t); //false

        System.out.println(100 != -100); //true
        System.out.println(100 != 100); //false
        System.out.println(100 == 100); //true

        ///////////////////


        int number1 = 5;
        System.out.println(number1);

        number1++;  // 5+1

        System.out.println(number1);


        int price = 19;
        price++; //19 + 1
        price++;
        price++; //22
        price--; //21
        System.out.println(price);

        /*
        compound operators
        +=
        -=
        *=
        /=
        %=
         */

        int digit1 = 10;
        int digit2 = 5;

        digit1+=2; //12  //digit1 = digit1 + 2;

        digit2+=3; //digit2 = digit2 + 3
        System.out.println(digit2);

//        ========

        int cost = 25;
        cost /= 5; //cost = cost / 5 = 5
        cost *= 10; //50 ----> cost = cost * 10  = 50

        // 50 % 20 = 10
        cost %= 20;
        System.out.println(cost);

        Test myObject1 = new Test();
        myObject1.variable1 = 9;







    }

}

