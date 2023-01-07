package recapWhapperClass;

public class Casting {
    public static void main(String[] args) {

         byte a = 20;
         int b = a ;
         short c = a;
         long d = a;
         float q = a;
         double s = a;

         int intNum = 189;
         byte byteNum = (byte)intNum;   // -128 to 127
         System.out.println(byteNum);

         short shortNum = (byte)intNum;
         short shortNum2 = (short)intNum;
         short shortNum3 = byteNum;

         /*
         explist casting : put l , L in end of long , f , F in the end of float
          */

        long longNum = 132;
        intNum = (int)longNum;   //explicit
        byteNum =(byte)longNum;  // explicit
        System.out.println("byteNume: " + byteNum);

        double doubleNum = longNum;
        doubleNum = intNum;    // implicit
        doubleNum = 2324.9999f;  // implicit
        doubleNum = 2455.948f;   // implist casting
        float floatNum = (float) doubleNum;

        shortNum = (short) 32767;     // explicit
        System.out.println(shortNum);

        floatNum = (float) 134134.4343;  // explicit casting
        floatNum = 1343.4343f;  // explicit casting
        floatNum = 23.2f;   // explicit
    }
}
