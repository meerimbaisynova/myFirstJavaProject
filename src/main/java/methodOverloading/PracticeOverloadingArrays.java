package methodOverloading;

import java.util.Arrays;

public class PracticeOverloadingArrays {
    public static int[] rotate(int[] array, String rotate) {
        if (rotate.equals("left")) {
            int[] newRotated = {array[1], array[2], array[0]};
            return newRotated;
        } else if (rotate.equals("right")) {
            int[] newRotated = {array[2], array[1], array[0]};
            return newRotated;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println(Arrays.toString(rotate(array1, "left")));   //2,3,1
        System.out.println(Arrays.toString(rotate(array2, "left")));
        System.out.println(Arrays.toString(rotate(array1, "right")));
        System.out.println(Arrays.toString(rotate(array2, "down")));

        System.out.println(reverse("Apple"));
        System.out.println(reverse("Chicago"));

        reverse("mak");
        reverse("apple");
    }

    /*
    create a method , which takes String, and returns reserved String
    apple = ==> elpha
    Chicago ==> ogacihC
     */
    //public static int [] rotate (int [])
    public static String reverse(String str) {

        String reserveText = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reserveText = reserveText + str.charAt(i);
        }

        System.out.println(reserveText);
        return reserveText;
    }

    public static String reverse(String str, boolean b) {
        if (b) {
            String result = "";
            for (int i = 0; i <= str.length(); i++) {
                result = result + str.charAt(i);
            }
            System.out.println(result);
            return result;
        }
        return str;
    }
}