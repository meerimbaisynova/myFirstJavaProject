package recapWhapperClass;

import java.util.Scanner;

public class whapperRecapClass { public static void main(String[] args) {

        /*
        Create one int and one boolean object with data
         */

    Integer a = 5;
    Boolean b = true;

    Scanner sc = new Scanner(System.in);

    boolean n = true;
    boolean j = n;

    int number = 123434;
    Integer number2 = number;

    //==================

    Integer k = Integer.valueOf(7);
    Integer f = Integer.valueOf("1");

    short q = Short.valueOf("35");
    short z = Short.valueOf((short) 35);

    Float f1 = Float.valueOf(66.5f);
    Float f2 = Float.valueOf("66");
    Float f3 = 66.5f;

    Byte byt1 = Byte.valueOf((byte) 3);
    Byte byte2 = Byte.valueOf("4");
    Byte byte3 = 5;

    Boolean b1 = Boolean.valueOf("true");
    Boolean b2 = Boolean.valueOf("false");
    Boolean b3 = Boolean.valueOf("false");
    Boolean b4 = Boolean.valueOf("SoneString");
    Boolean b5 = true;
    System.out.println(b4);

    Long s = Long.valueOf(8);
    Long s1 = Long.valueOf(55);
    Long s2 = Long.valueOf("Number");
    Long s4 = Long.valueOf("45");
    System.out.println(s1);
    Long s5 = 1l;

    Double d = Double.valueOf(34.489);
    Double d1 = Double.valueOf("4845.8383");
    Double d2 = Double.valueOf(9449.234);
    Double d3 = 84398.90;

    System.out.println(d2);
}
}
