package esenReviews;

import java.util.Scanner;

public class Paper {
    public static void main(String[] args) {
        String str = "Published on Feb 12, 2018";
        //trim();removes the white spaces in the beginning and end

        String year = str.substring(str.length()-4);
        System.out.println(year);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the messega:");
        String message = scanner.nextLine();

        if (!message.isEmpty()){
            // we want to continue and check for second condition
            if (message.endsWith(".")){
                System.out.println("The message is valid!");
            }
            //Nested if statement :when we use if statement inside if statement


        }
    }
}
