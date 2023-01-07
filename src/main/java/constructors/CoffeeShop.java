package constructors;

public class CoffeeShop {

    /*
    VARIABLES
   - name
    -position
    -salary
    -gender
    -isExperienced

    METHODS
    talk to client
    steam milk
    take order
    wash hands
    get tips
    get name of client
    is happy
     */
    public static void main(String[] args) {
        Barista barista1 = new Barista("John", "senior barista",25);
        Barista barista2 = new Barista("Ahmad"," junior barista", 15);
        Barista barista3 = new Barista("Julia","intern", 5);

        barista1.talkToClient("Nursultan");
        barista1.takeOrder("cappucino", "Nursultan");
        barista1.washHands(false);
        barista1.steamMilk("oat");
        barista1.getTips(1);


        barista2.washHands(true);
        barista2.steamMilk("almond");
        barista2.takeOrder("flat white","Bena");
        barista2.getTips(2);

        System.out.println(barista2.jarOfTips);  // 2.50
        System.out.println(barista1.jarOfTips);  //


        System.out.println(barista3.salary);

        Barista barista4 = new Barista("Anna" , true) ;
        barista4.position = "manager";

    }

}
