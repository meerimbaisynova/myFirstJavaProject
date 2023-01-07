package arrays;

import java.util.Arrays;

public class ArraybinarySearch {
    public static void main(String[] args) {

        String[] strArr = {"Chicago", "LA", "San - Francisco" , };
        int index = Arrays.binarySearch(strArr, "LA");
        System.out.println(index);

        System.out.println(Arrays.binarySearch(strArr,"Chicago"));
    }
}
