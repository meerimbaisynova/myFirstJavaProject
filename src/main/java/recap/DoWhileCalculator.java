package recap;

import java.util.Scanner;

public class DoWhileCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number");
        int a = sc.nextByte();
        System.out.println("Wohoo, your number is :" +a);

        System.out.println("Please enter your name?");
        String name = sc.next();
        System.out.println("Hello" + name);

        /*
        ask for the first number
        ask for arithmetic operator: +, - , /, %
        ask for the second number
        perform your operator
        and print out the result
        ------------
        Enter first number:
        5
        Enter arithmetic operator : +, -, *, /, %
        +
        Enter second number:
        10
        The result : 5+10=15
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please print first number");
        int b = sc.nextInt();

        System.out.println("Second number" );
        int c = sc.nextInt();
        System.out.println("Enter arithmetic operator ");
        String operator = scan.next();
        if(operator.equals("+") ){
            System.out.println(b+c);
            } else if (operator.equals("-")){
            System.out.println(b-c);
        }else if(operator.equals("*")){
            System.out.println(b*c);
        } else if (operator.equals("/")) {
            System.out.println(a/b);
        } else if (operator.equals("%")) {
            System.out.println(a%b);
        }
        else {
            System.out.println("Incorect arithmetic operator");
        }
    }
}
