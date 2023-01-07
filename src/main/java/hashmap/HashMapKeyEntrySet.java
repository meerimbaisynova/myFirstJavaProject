package hashmap;

import java.util.HashMap;

public class HashMapKeyEntrySet {
    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");

        // print only keys
        for (Integer key : numbers.keySet()) {
            System.out.println(key);
        }
        // print only values
        for (Integer key : numbers.keySet()) {
            System.out.println(numbers.get(key));
        }


        for (Integer key : numbers.keySet()) {
            System.out.println(key + "-" + numbers.get(key));
        }

        HashMap<String, String> fruitsAndVegetables = new HashMap<>();
        fruitsAndVegetables.put("apple", "fruet");
        fruitsAndVegetables.put("carrot", "vegetable");
        fruitsAndVegetables.put("banana", "mango");
        fruitsAndVegetables.put("water melon", "potato");

        System.out.println(fruitsAndVegetables);
        fruitsAndVegetables.get("apple");

        for (String key : fruitsAndVegetables.keySet()) {
            if (fruitsAndVegetables.get(key).equals("vegetables")) {
                System.out.println();
            }
        }
        /*

         */
        HashMap<String, String> words = new HashMap<>();
        words.put("window", "house");
        words.put("brick", "house");
        words.put("rain", "nature");
        words.put("water", "swimming");
        words.put("association", "organization");
        words.put("software", "system");

        /*
        1.print values with length <=5
        length () <= : house
        2.print the values with length >= 7
        length() >= 7: swimming
        3. print keys that start with letter a , or b , or c
        starts with a or b or c : word
        4.print keys that end
         */

        for (String key : words.keySet()) {
            if (words.get(key).length() <= 5) {
                System.out.println("length <= 5; " + words.get(key));
            } else if (words.get(key).length() >= 7) {
                System.out.println("length > =7: " + words.get(key));

            }
        }
        for (String key : words.keySet()) {
            if (words.get(key).length() >= 7) {
                System.out.println("length >= 7; " + words.get(key));
            }
        }
        for (String key : words.keySet()) {
            if (key.startsWith("a ")  || key.endsWith("o")){
                System.out.println("ends with e or o : " + key);
            }

            }

    }}

