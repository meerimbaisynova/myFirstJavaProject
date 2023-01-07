package recapWhapperClass;

public class PracticeCasting {
    public static void main(String[] args) {

        // CONVERT STRING TO PRIMITIVE INT

        String intNumber = "19932";
        Integer intNumber2 = Integer.valueOf(intNumber);
        int r = intNumber2;

        // CONVERT STRINGNUMBER TO PRIMITIVE DOUBLE
      //  Double dd = Double.valueOf(stringNumber);
      //  double dd2 = dd;

       // String StringNumber;
       // Short s = Short.valueOf(StringNumber);
      //  short sh2 =

        String intWrap = "233";
        Integer intWrap2 = Integer.valueOf(intWrap);

        Double dounleWrap = Double.valueOf(intWrap);

        Short shortWrap = Short.valueOf(intWrap);

        Integer intb= Integer.valueOf("4243");
        String strObj = String.valueOf(intb);

        /*
        Convert to primitive
         */
        Integer intObj = Integer.valueOf("200");
        int int1 = intObj;
        int int2 = Integer.valueOf(intObj);

        Double myDouble = Double.valueOf(123.655);
        double double1 = myDouble;
        Double myDouble2 = Double.parseDouble("12346.222");
        double double2 = myDouble2;

        Boolean boo = Boolean.valueOf(true);
        boolean boolean1 = boo;
        Boolean boo2 = Boolean.valueOf("false");
        boolean boolean2 = boo2;

        /*
        Convert Whapper class object to String

         */


    }
}
