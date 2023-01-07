package arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] animals = {"elephant", "giraffe", "wolf", "lion"};
        String animal1 = animals[0];
        String animal2 = animals[1];
        String animal3 = animals[2];
        String animals4 = animals[3]; // if more than 3, we see outOfBoundsError

        System.out.println(animal1);  //elephand
        System.out.println(animals[2]);   //wolf
        System.out.println(animals[10 - 8 + 1]);  // lion
        System.out.println(animals[animals.length - 2]);  //wolf

        int[] fibonacciNumbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        int num1 = fibonacciNumbers[2];  //2
        num1 = fibonacciNumbers[5];     //8
        int num2 = fibonacciNumbers[0];  //1
        int num3 = fibonacciNumbers[fibonacciNumbers.length - 5];
        System.out.println(num3);

        // ====================
        String[] cities = new String[5];
        System.out.println(cities[0]);  // null

        cities[0] = "Los Angeles";
        cities[1] = "Paris";
        cities[2] = "Rome";
        cities[3] = "Dubai";
        cities[4] = "Tokyo";

        System.out.println(cities[0]);
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
        cities[3] = "Kuala - Lumpur";

        // String countries[];
        String[] countries; // declared / created array of string
        countries = new String[]{"USA ", "Argentina", "Italy", "Japan", "", null, "Ukraine"};//7
        countries[6] = "Singapore";
        countries[5] = "Kazakstan";

        double[] prices = {1.99, 2.99, 3.99, 20.99, 99.99};
        long[] longArray = {1343, 36677, 235, 545, 646, 6366, 99};
        boolean[] boolenArr = {true, true, false, true, false};
        char charArr[] = {'w', 'j', 's', 'o', 'd', '!',};
        char c = 65535;
        System.out.println(c);
        short[] shortArray = {44, 33, 22, 55, 77, 88};

        int lengthOfNames = 9;
        String[] names = new String[lengthOfNames];

        byte lengthOfLastNames = 9;
        String[] lastNames = new String[lengthOfLastNames];

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[4]);
        }

        String[] berries = new String[5];
        String[] fruits = new String[]{"", "", "", "", "", ""};


        int [] number = new int[]{5,4,6,} ;
        boolean[] booleans = {true, false};
        double[] myboolean = {900, 99, 1.99, 2.99, 5.99, 89.99};
        short shorter[]= {456, 8374, 66,44 };
        char myChar[] = {'y','!', '2','4', };



    }
}