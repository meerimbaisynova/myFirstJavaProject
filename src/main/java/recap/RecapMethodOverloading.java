package recap;

public class RecapMethodOverloading {
    public static void main(String[] args) {
        sayHi("Erika");
        sayHi("Nurbek");
        sayHi("Erika ", "Nurbekova");
    }

    /*
    This is Body of the class

   Class can
     */
    String str = "hello";
    int a = 5;

    public static void sayHi(String name) {
        System.out.println("Hi " + name);
    }

    public static void sayHi(String firsName, String lastName) {
        System.out.println("Hi " + firsName + lastName);


    }
}