package hashmap;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, String > antonyms = new HashMap<>();
        antonyms.put("cold", "hot");
        antonyms.put("long", "short");
        antonyms.put("hard", "soft");
        antonyms.put(null, "no data");
        antonyms.put("table", null);
        antonyms.put("screen", null);

        System.out.println(antonyms);
        System.out.println(antonyms.get("hard"));
        System.out.println(antonyms.get("soft"));
        System.out.println(antonyms.get("longi"));
        System.out.println(antonyms.get("null"));
        System.out.println(antonyms.get(null));

        System.out.println(antonyms.size());

        /*
        Create HashMap , productPrice <String , Double>
        add 5 elements
        print all elements in one line
        print 2 elements
        print size
         */

        HashMap<String,Double>productPrice = new HashMap<>();
        productPrice.put("milk",5.9 );
        productPrice.put("mango",2.0 );
        productPrice.put("bread",5.9 );
        productPrice.put("sugar",8.0 );
        productPrice.put("flour",56.9 );

        System.out.println(productPrice);
        System.out.println(productPrice.get("bread"));

        HashMap<String,String > fullName = new HashMap<>();
        fullName.put("Ulan","Belekov");
        fullName.put("Burul","Arunova");
        fullName.put("Erika","Moldokulova");
        fullName.put("messi","Andro");
        fullName.put("Jim","Kerry");

        System.out.println(fullName);
        System.out.println(fullName.get("Moldokulova"));

        HashMap<Integer, Integer>demicals = new HashMap<>();
        demicals.put(1,100);
        demicals.put(2,200);
        demicals.put(3,300);
        demicals.put(4,400);
        demicals.put(5,500);
        demicals.put(6,600);
        demicals.put(7,700);
        demicals.put(8,800);
        demicals.put(9,900);
        demicals.put(10,1000);

        boolean contains = demicals.containsKey(2); // true
        System.out.println(contains);

        System.out.println(demicals.containsKey(500));  //false

        System.out.println("10000-9000:" +demicals.containsValue(10000-9000));  // true
        System.out.println((demicals.containsValue(null)));   //false
        System.out.println(demicals.containsKey(demicals.get(1)-99));  //true
        System.out.println(demicals.containsKey(demicals.get(9)));

        System.out.println("decimals: " + demicals);
        System.out.println("decimals size :" + demicals.size());

        demicals.remove(2);
        demicals.remove(15);  // non existent key, nothing will happen
        System.out.println("printing 2 : " + demicals.get(2));
        demicals.put(11,1100);

        System.out.println("decicals size: " + demicals.size());

        System.out.println("removing all values");
        demicals.clear();   // remove all values
        System.out.println("demicals size : " + demicals.size());



        HashMap < Integer, String > orders = new HashMap<>();
        orders.put(4,"four");
        orders.put(10,"ten");
        orders.put(1234,"te3f");
        orders.put(575535,"five");
        orders.put(12,"tvelve");
        orders.put(5,"five");
    }
}
