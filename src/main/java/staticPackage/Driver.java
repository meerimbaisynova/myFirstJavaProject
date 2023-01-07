package staticPackage;

public class Driver {
    String name;
    static boolean isPaid;
    static {
        System.out.println("Good morning! Trucking company is open now");
    }
    public Driver(String name) {
        System.out.println("Hired a new driver : " +name);
    this.name = name;
    }
    {
        System.out.println("HR is hiring a new driver");
}
static {
    System.out.println("Good morning ! Trucking company is open now");
}
public void drive(String  destination){
    System.out.println(name + "is on route");
    this.name =name;
}
public static  boolean getPaid(){
    System.out.println("Drivers got paid");
    isPaid = true;
    return true;

}

        }
