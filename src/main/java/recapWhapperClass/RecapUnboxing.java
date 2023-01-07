package recapWhapperClass;

public class RecapUnboxing {
    public static void main(String[] args) {
        /*
        UNBOX IS -- CONVERT OBJECT TO PRIMITIVE
         */
         Integer a = 10;
         int b = a; // unboxing

        Integer c = Integer.valueOf("123");
        b= c ; // unboxing

        Byte b1 = Byte.valueOf((byte)15);
        byte b2 = b1;

        Short s1 = Short.valueOf((short) 123);
        short s2 = s1;

        Long l1 = Long.valueOf(342235);
        long l2 = l1;

        Double d1 = Double.valueOf(43.99);
        double d2=d1;

        Character ch1 = Character.valueOf('@');
        char ch2 = ch1;



    }
}
