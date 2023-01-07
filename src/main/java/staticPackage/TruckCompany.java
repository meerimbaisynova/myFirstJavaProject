package staticPackage;

public class TruckCompany {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Donald");
        Driver driver2 = new Driver("David");

        driver1.drive("Minnoseta");
        driver2.drive("Pennsylvania");

        Driver.getPaid();

        System.out.println(driver1.isPaid);  // true
        System.out.println(driver2.isPaid);


    }
}
