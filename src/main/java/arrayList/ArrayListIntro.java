package arrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("milk");
        groceryList.add("bread");
        groceryList.add("apples");

        System.out.println(groceryList);

        System.out.println(groceryList.get(1));
        System.out.println(groceryList.get(2));

        groceryList.add("ice cream");
        groceryList.add("peanut butter");
        groceryList.add("12");

        System.out.println(groceryList);

        /*
        ArrayList with to do list put 6 elements

         */
        ArrayList<String> pharmacyList = new ArrayList<>();
        pharmacyList.add("medicine");
        pharmacyList.add("tablet");
        pharmacyList.add("water");
        pharmacyList.add("cotton disk");
        pharmacyList.add("makeupp");




        ArrayList <String>toDolist2 = new ArrayList<>();
        toDolist2.add("clean house");
        toDolist2.add("grocery shopping");
        toDolist2.add("read books");
        toDolist2.add("watch movie");
        toDolist2.add("gook dinner");
        toDolist2.add("laundty");

        System.out.println(toDolist2.get(3));
        int size = toDolist2.size();


        for(int i = 0; i < toDolist2.size(); i++){
            System.out.println(toDolist2.get(i) + " - Done");
        }

        ArrayList < String> cars = new ArrayList<>();
        cars.add("Moserati");
        cars.add("Lamborgini");
        cars.add("Porche");
        cars.add("Mazda");
        cars.add("Bugatti");

        System.out.println(cars);
        cars.set(3, "Ferrary");  // CHANGE MAZDA TO FERRARI
        System.out.println(cars);

        cars.set(0, "Mersedes");
        System.out.println(cars);

        // change Bugatti to Astan Martin
        cars.set(4, "Astan MArtin");
        System.out.println(cars.get(4));

        System.out.println("size : " + cars.size());
        System.out.println(cars.get(1));   //==>Return Lambo

        cars.remove(0); // ===> remove firs element
        System.out.println(cars);
        System.out.println(cars.get(0));  //===> returns Lambo

        cars.remove(2);
        System.out.println(cars.size());
        System.out.println(cars);
        /*
        Ferrari
        Moserati
          0          1          2        3        4
        [Moserati, Lamborgini, Porche, Ferrari, Aston Martin
         */
        // add (int index, String element)
    cars.add(0,"Moserati");
    cars.add(3,"Ferrari");
        System.out.println(cars);

        System.out.println(cars.size());  // 5
        for (int i = 0; i < cars.size(); i++){
            if(cars.get(i).equals("ferrary")){
                System.out.println(cars.get(3));
            }
        }
        cars.clear();  // remove all elements from ArrayList
        System.out.println(cars.size());

    }




}
