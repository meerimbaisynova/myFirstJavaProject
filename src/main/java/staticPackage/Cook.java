package staticPackage;

public class Cook {

    public Cook(String name){

        this.name = name;
    }

    String name;
   static String order;


    public void washHand(){
        System.out.println(name+ "is washing hands");
    }

    public void prepareSalad(){
        System.out.println(name + "is preparing a salad");
    }

    public static void takeOrder(String orderName){
        System.out.println(orderName +"order received");
        order = orderName;
    }



    {
        System.out.println("this is my block of code" + name);
    }
    static {
        System.out.println("this is static block of code" );
    }








}
