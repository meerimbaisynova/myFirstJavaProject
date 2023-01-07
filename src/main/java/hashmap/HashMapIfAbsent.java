package hashmap;

import java.util.HashMap;

public class HashMapIfAbsent {
    public static void main(String[] args) {

        HashMap<String , String > catOwners = new HashMap<>();
        catOwners.put("tom", "Mira");
        catOwners.put("Garfield", "Aisuluu");
        catOwners.put("Akjoltoi", "Saikal");
        catOwners.put("Myimyi", "Myrzakan");

        System.out.println("The size : " + catOwners.size());
        System.out.println("Cat Owners " + catOwners);

        catOwners.putIfAbsent("Arti", "Alina");
        System.out.println("The size : " + catOwners.size()) ;
        System.out.println("Cat Owners " + catOwners);

        catOwners.putIfAbsent("Ginger", "Alina");
        System.out.println("The size : " + catOwners.size()) ;
        System.out.println("Cat Owners " + catOwners);

        /*
        print only cats:
        cat #1:
        cat #2:
        cat #3:
         */

      int i = 1;
      for (String cat : catOwners.keySet()){
          System.out.println("Cat # " + i + " " + cat);
          i++;
      }
      /*
      cat # 1 : Tom , owner #1 : Mira
      cat # 2 : Arti , owner #2 : Alina
       */
        int j = 1;
        for (String cat : catOwners.keySet()){
            System.out.println("Cat # " + j + " " + cat +  " , Owner # " + j + catOwners.get(cat));
            j++;
        }
        for (String catOwnerName : catOwners.values()){
            System.out.println("cat owner name : " + catOwnerName);
        }
        catOwners.replace("Arti" , "Ilgiz");  // replace a values
        System.out.println(catOwners);
    }

}
