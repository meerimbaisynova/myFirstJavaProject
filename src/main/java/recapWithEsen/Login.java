package recapWithEsen;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        login("1-773 3472 34",true);
        login("608-234-3223",true);
        login("248 035 2323",true);
        login("james235", "James2022!");
        login("james@gmail.com",false);
/*
        1.Method declaration , signature  of the method
        2. Remove " - "  and " " : str.replace ("-", "");
        3.Check the length
        4. If length is 10 or 11 then generate random number up to 1000
        5. Print the message
        6. If invalid number given print " Invalid phone number"
 */
    }
    public static void login (String phoneNumber, boolean isPhoneNumber ){
        if(isPhoneNumber){

        }else {
            System.out.println("Invalid phone number");
        }
        // re - assignment
        phoneNumber=phoneNumber.replace("-","");
        phoneNumber=phoneNumber.replace("-","");
        System.out.println(phoneNumber.length());

        if (phoneNumber.length() ==10 && phoneNumber.length()==11){


            // valid phone number
            Random random = new Random();
            int passcode = random.nextInt(1000);
            System.out.println("Passcode: " + passcode + " is sent to Phone number " + phoneNumber);
        } else{
            // phone number is invalid
            System.out.println("Invalid phone number");
        }
    }

        public static void login(String username , String password){
        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Invalid credentials. Try again");
        }
        else {
            System.out.println("login succesful");
        }

        }
}
