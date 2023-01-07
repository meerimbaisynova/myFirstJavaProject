package hashmap;

import java.util.Hashtable;

public class HashtableIntro {
    public static void main(String[] args) {

        Hashtable<String, Integer > productPrices = new Hashtable<>();
        productPrices.put("apples" , 3);
        productPrices.put("sugar" , 5);
        productPrices.put("pepper" , 1);
        productPrices.put("avacodo" , 2);
        productPrices.put("chicken" , 2);
        productPrices.put("milk" , 4);

        getProductsInrange(productPrices, 1,4);
        getProductsInrange(productPrices, 5,2);
        getProductsInrange(productPrices, -56,45);
        getProductsInrange(productPrices, 45,34);
        getProductsInrange(productPrices, 33,100);
    }


    /*
    if quantity = 2
    multiple price by quantity
    6+10+2  =sum
     */
    public static int calculatTheSum (Hashtable<String, Integer> products, int quantity){

        int sum = 0;
        for (String key: products.keySet()){
            sum +=products.get(key)*quantity;
        }
        System.out.println("The product to buy: " + products);
        System.out.println();
        return sum;
    }
    public static Hashtable < String , Integer > getProductsInrange (Hashtable<String , Integer > products , int beginRange, int endRange) {
        Hashtable<String, Integer> newProduct = new Hashtable<>();
        for (String key : products.keySet()) {
            if (products.get(key) <= beginRange && products.get(key) >= endRange) {
                newProduct.put(key, products.get(key));
            }
        }
        System.out.println(newProduct);
        return newProduct;

        /*
        create a method that return a hashtable woth products in the given range and includes only those products that start with a
         */

    }
  //  public static Hashtable < String , Integer > getProductsInrangeWithLet (Hashtable<String , Integer > products , int beginRange, int endRange){

   // }

}
