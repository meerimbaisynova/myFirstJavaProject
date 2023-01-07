package staticPackage;

public class Restaurant {
    public static void main(String[] args) {
        Cook cook1 = new Cook("Ramsey Gordon");
        Cook cook2 = new Cook("Salt bae");

        cook1.washHand();
        cook2.prepareSalad();

        cook1.takeOrder("rib eye steak");

        System.out.println(cook2.order);

        cook2.takeOrder("fettucini");
        System.out.println(cook1.order);

    }
}
