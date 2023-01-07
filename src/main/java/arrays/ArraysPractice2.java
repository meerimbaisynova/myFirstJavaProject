package arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        int[] arr1 = { 1,2,3,5,6};
        int x =5;
        System.out.println(containsX(arr1, x )); // false
        System.out.println(containsX(arr1, x)); // false
        int [] arr2 = {1,2,3,5,6};
        int [] arr3 = {1,2,3,5,6};
        System.out.println(containsX(arr2,x)); //true

    }

    /*
    which takes array of int and int x, if array contains x, return true , else false
     */
    public static boolean containsX(int[] array, int x) {
        /*
        1. for loop
        2. tostring , contains ();
         */
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }
        }
        return false;

    }
    public static boolean containX2 (int[] array, int x){
        String str = Arrays.toString(array);

        if(str.contains(x+"")){
            return true;
        }else {
            return false;
        }
    }
}

