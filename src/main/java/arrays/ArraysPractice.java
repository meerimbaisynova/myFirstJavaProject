package arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        /*
        create array of string - groceryList, with length of 5
        assign values to each element
        using for loop , print all elements
         */
        int numberOfGroceries = 5;
        String[] groceryList = new String[numberOfGroceries];
        groceryList[0] = "bishkek";
        groceryList[1] = "marina";
        groceryList[2] = "dordoi";
        groceryList[3] = "ainuska";
        groceryList[4] = "wallmat";


        for (int i = 0; i < groceryList.length; i++) {
            System.out.println(i + 1 + ")" + groceryList[i]);
        }

        char[] array = new char[]{'c', 'o', 'd', 'i', 'n', 'g', ' ', 'i', 's', ' ', 'g', 'r', 'e', 'a', 't'};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String[] colors = new String[]{"green", "red", "white", "black", "red", "blue", "yellow"};
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals("yellow") || colors[i].equals("green")) {
                continue;
            }
            System.out.println(colors[i]);
        }

        /*create array of ints , {1,2,3,4,5,6,7,8,9,10}
        print all numbers
        if number = 3, or number = 8
        do not print
         */
       int numbers [] = new int[ ] {0,1,2,3,4,5,6,7,8,9,10 };
       for (int i = 0 ; i < numbers.length; i++){
           if (numbers [i] == 3 || numbers [i] == 8) {
               continue;
           }
           System.out.println(numbers[i]);
       }

       double [] doubles = new double[]{1.99,2.99, 3.99,4.99,5.5,6.99,7.0,8.99,9.99,10};
       for ( int i = 0; i < doubles.length ; i++){
           if (i>=5 && i<=8){
               continue;
           }
           System.out.println(doubles[i] + ",");
       }

    }
}
