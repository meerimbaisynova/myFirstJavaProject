package arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        String [] strArray = {"banana", "orange", "apple", "kivi"};
        Arrays.sort(strArray); // this sorts array in ascending order
        System.out.println(Arrays.toString(strArray));  // apple, banana, kivi, orange

        double [] doubleArr = new  double[] { 7.5, 7.99, 8.4, };
        System.out.println("origina" +Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println("sorted : " +Arrays.toString(doubleArr));

        int [] myInt = {4,7,5,2,43,564,6,76,86,7,5,75,65,43,4,2,2,4,443,4,};
        System.out.println(myInt);

        String [] strArray1 = {" Chicago", "Bishkek", "New York"};
        Arrays.sort(strArray1);
        System.out.println("sorted :"+Arrays.toString(strArray1));


    }

}
