package arrays;

import java.util.Arrays;

public class ArraysTosting {
    public static void main(String[] args) {
        String [] strArray1 = {"Good", "Morning", "Everyone"};
        String [] strArray2 = { "Good", "Morning", "Everyone"};
        String [] strArray3 = strArray1;
        System.out.println(strArray1);
        System.out.println(strArray2);
        System.out.println(strArray3);
        strArray1[0] = "Early";
        System.out.println(strArray3);

        System.out.println(strArray1);
        /*
        Arrays.toString (arr) method converts all values of any type of array into
        one String
         */
        System.out.println(Arrays.toString(strArray2));

        int[] intArray = {1,2,3,4,5,6,7,8,9,0};
        System.out.println();

        String str = Arrays.toString(intArray);
        System.out.println(str);

        double [] doubleArray =  {16.9,34.5,5.9,6,70,8.0,9.00,};
            System.out.println();

            byte[] byteArray = {1,2,3,4,5,6,7,8,9,0};
        System.out.println();

        short[] myShort = {345,385,60,8,9,0};
        System.out.println(myShort);


        }
    }

