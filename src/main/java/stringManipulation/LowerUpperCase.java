package stringManipulation;

public class LowerUpperCase {
//        ====================== toLowerCase(), toUpperCase()
//    These are String methods, that convert text to all lower case, or all upper case

    public static void main (String [] args){
        String shop1 = "Amazon";
        String shop2 = "amazon";

        boolean isSame;

        isSame = shop1.equals(shop2);
        System.out.println("Amazon is same as amazon: " + isSame);

        shop1 = shop1.toLowerCase();  //Amazon ---> amazon
        isSame = shop1.equals(shop2);
        System.out.println("amazon is same as amazon: " + isSame);


        String car1 = "MERCEDES";
        String car2 = "Rolls Royce";
        String car3 = "MercedeS";
        String car4 = "rolls royce";

        isSame = car1.equals(car3.toUpperCase()); //MERCEDES.equals(MERCEDES)

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);
        System.out.println("car4: " + car4);

        car3 = car3.toUpperCase();
        System.out.println(car3);

        System.out.println(car3 + " " + car1);

        car1 = car1.toLowerCase();
        car3 = car3.toLowerCase();

        System.out.println(car3 + " " + car1);

        System.out.println("RoLLs RoyCE".equals(car4));  //RoLLs RoyCE .equals rolls royce
        System.out.println("RoLLS RoyCE".toLowerCase().equals(car4));

        System.out.println("ChiCaGo".equals("chIcAgO"));
        System.out.println("ChiCaGo".toUpperCase().equals("chIcAgO".toUpperCase()));


//        ================= equalsIgnoreCase()

        System.out.println("ChiCaGo".equals("chIcAgO")); //false
        System.out.println("ChiCaGo".equalsIgnoreCase("chIcAgO")); //true

        String person1 = "Brad Pitt";
        String person2 = "Brad pitt";

        boolean isPitt = person2.equals(person1);
        System.out.println("isPitt: " + isPitt);

        isPitt = person2.equalsIgnoreCase(person1);
        System.out.println("isPitt: " + isPitt);

        isPitt = person2.equals(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt);

        isPitt = person2.toLowerCase().equals(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt);

        isPitt = person2.toLowerCase().equalsIgnoreCase(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt);


//        ===========






    }



}
