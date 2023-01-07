package esenReviews;

import java.util.Scanner;

public class Practice {
    // i create a real password first and save it in the variable . Check the entered password against this.
    // String cekret = "Hello"
    // PSEUDO CODE
    // 1. CREATE real password and store it somewhere
    // 2.Create a Scanner so that i can ask from user to enter paaaword
    // 3.Create a loop that keep runnning until i change the condition
    // ask a user to enter the password and store that into String

    public static void main(String[] args){
        String secretKey ="Chicago2022!";
        Scanner scanner = new Scanner(System.in);

        int maxAttempts = 3;
        int attempt = 0;

        while (true){
            System.out.println("Please enter your password: ");
            String enteredPassword = scanner.nextLine();
            if (enteredPassword.equals(secretKey)){
                System.out.println("Successfully logged in!");
                break;
            }else {
                System.out.println("Wrong password ! Try again!");
                attempt++;
            }
            if (attempt == maxAttempts){
                System.out.println("Maximum attempts reached ! Account suspended ");
                break;
            }
        }

        // Change the current program and limit the number of attempts to 3.
       // create a variable that stores number of attemps
        // create a variable that counts the attemps every time user enters wrong password
    }
}
