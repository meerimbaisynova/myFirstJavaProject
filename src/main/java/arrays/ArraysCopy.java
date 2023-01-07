package arrays;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {

        int [] intArr1 = {1,2,3,4,5,};
        int [] intArr2 = intArr1;
        System.out.println(intArr1[0]);  //1
        System.out.println(intArr2[0]);  //1

        intArr2[0] = 10;
        System.out.println(intArr1[0]);  //10


        //====================
        String [] strArr1 = {"Hello", "hi","dfa", "fast", "asfas"};
       // String [] strArr2 = Arrays.copyOf(strArr1[0]);


    }
}
