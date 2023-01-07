package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysReserveOrder {
    public static void main(String[] args) {

        int a = 6;  // primitive
        Integer b = 6; // non primitive , objects, wrapper class

        Integer[] intArray = {5,6,3,0,1,2};
        // 0,1,2,3,5,6,==> ascending order
        // 6,5,3,2,1,0 ==> Descending order
        Arrays.sort(intArray);
        System.out.println("ascending :" + Arrays.toString(intArray)); // sorted in desc
        System.out.println("descending :" + Arrays .toString(intArray));

        /*
        String, char, double
         */
        String [] strArray = {"Good Day", "Good night","Good evening "};
        Arrays.sort(strArray);
        System.out.println("ascending:" +strArray);
        System.out.println("descending:" +strArray);

        double [] MyDoubles = {22.9, 42,44, 99.9, 64.0};
        Arrays.sort(MyDoubles);
        System.out.println("ascending:" + MyDoubles);
        System.out.println("descending:" + MyDoubles);

        Character [] charArray = {'w', 'y','x', 'b', '5' };
        Arrays.sort(charArray);
        System.out.println("ascending:" + Arrays.toString(charArray));


        Arrays.sort(charArray, Collections.reverseOrder());
        System.out.println("descending:" +Arrays.toString(charArray));


        int[] arr1 = {3,7,9,3,6,8,0,};
        sortInt(arr1);

        sortInt(new int[]{3,7,9,3,6,8,0});

        Integer [] intArr1 = {1,2,3,45,5,646,};
        reverseOrder(intArr1);


    }
    public  static  int [] sortInt(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static Integer [] reverseOrder (Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}



