package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLoop {
    public HashMapLoop() {
        super();
    }

    public static void main(String[] args) {

        HashMap<String, Integer > ages = new HashMap<>();
        ages.put("Rahul" , 30);
        ages.put("Patel" , 48);
        ages.put("Chitra" , 32);
        ages.put("Deepak" , 12);
        ages.put("Suresh" , 50);
        ages.put("Chandramouli" , 45);
        ages.put("Padmanbhan" ,65);

        ages.get("Patel");

        /*
        print ages - print values
        key(), returns the set of keys
         */

        for (String name : ages.keySet()){
            System.out.println(ages.get(name));
        }

        /*
        print names  - print keys
         */
        for ( String name: ages.keySet()){
            System.out.println(name);
        }

        String userName1 ;
        int age1 ;

        for (String name : ages.keySet()){
            if (name.equals("Rahul")){
                userName1 = name;
                age1 = ages.get(name);
            }
        }
     //  System.out.println("Name: " + userName1 + " Age : " +age1);

        /*
        Create array of name

         */
        String [] names = new String[ages.keySet().size()];
        int i = 0 ;
        for (String name : ages.keySet()){
            names [i] = name;
            i++;
        }
        System.out.println(Arrays.toString(names));

        /*
        create and print array of ages
         */
        int [] arrayOfages = new int [ages.size()] ;

       int k = 0;
       for (String name : ages.keySet()){
           arrayOfages [k] = ages.get(name);
           k++;
        }
        System.out.println(Arrays.toString(arrayOfages));

        System.out.println("Just printing the hashmap itself: " + ages);
        System.out.println("Printing the entryset of the map: " + ages.entrySet()) ;



    }
}
