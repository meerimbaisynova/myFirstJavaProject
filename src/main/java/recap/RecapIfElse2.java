package recap;

import java.util.Arrays;
import java.util.Scanner;

public class RecapIfElse2 {
    public static void main(String[] args) {
        /*
        Job Hiring interwiev
        If you have 1 often and you were in the market for more than  1 month , accept it right away else if , you have
        1 offer and you were in the market for less than 1 mounth {
        you check the salary , if salary more then 100k, accept else reject
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days you were in the market?");
        int jobHuntingTime = sc.nextInt();

        System.out.println("How many offers do you have");
        int offersNumber = sc.nextInt();

        double[] salaries = new double[offersNumber];

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Please enter salary of offer #" + i);
            salaries[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(salaries));
        if (jobHuntingTime >= 30 && offersNumber == 1) {
            System.out.println("I was the market for more than mounth , and i have 1 offer of " + salaries[0]);
            System.out.println("Accepting that number");
        } else {
            if (salaries[0] > 10000) {
                System.out.println("Accepting the offer since it's " + salaries[0]);
                System.out.println("And i was in the market for less than a month, and got one offer");
            } else {
                System.out.println("Salary is less than 100 k, rejecting it");
            }
        }

    }
}
