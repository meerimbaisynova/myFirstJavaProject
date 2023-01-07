package arrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        contains (element ) it will return boolean
        true if contains , false if doest contain
         */

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        /*
        into evenNumbers , add even numbers from 0, 20
         */

        for (int i = 0; i <= 20; i++){
            if( i% 2 == 0){
                evenNumbers.add(i);
            }

        }
        System.out.println(evenNumbers);
        /*
         Create arrayList of Integer , and put numbers divisible by 3 in a range from 0 to 100
         */


        ArrayList<Integer> numbers= new ArrayList<>();
        for (int i = 0; i <= 100; i++){
            if ( i % 3 == 0){
                numbers.add(i);
            }
        }
        System.out.println( numbers );



        /*
      Create arrayList of String , and put 100 apples inside 1 apple , 2 apples, 3 apples ... 100 apples
      arter remove apples number 10,20,30,40,50,60,70,80,90
      print size of array
      in the same list ,add more apples in a range from 1000 to 1100
      only  odd numbers : 1001 apples , 1003 apples, 1005 apples .. 1099 apples

 */

        ArrayList<String >apples = new ArrayList<>();
        apples.add("1 apple");

        for (int a = 2; a <= 100; a++){
            apples.add(a + "apples");
            if ( a % 10 != 0){
                apples.add(a+" apples");
            }
        }
        System.out.println(apples);

        for (int j = 1000 ; j <=1100; j ++ ){
            if (j % 2 != 0 ){
                apples.add(j+"apples");
            }
        }
        boolean b = apples.contains("2 apples");
        System.out.println(b);  // true

        b=apples.contains("2 apple");
        System.out.println(b);   // false

        b = apples.contains("10 apples"); // false




        }
    }



