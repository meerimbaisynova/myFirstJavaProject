package loops;

import javax.swing.text.TabableView;

public class NestedWhileLoop {
    public static void main(String[] args) {

        /*
        YEAR 2021
             month  1
             mounth 2

        YEAR 2022
             month 1
             month 2
        YEAR 2023
             month 1
             month 2
         */

        int r = 2021;
        while (r <= 2023){
            System.out.println( "YEAR: " +r);
            r++;

            int e =1;
            while (e <= 12){
                System.out.println("   month:" +e);
                e++;
            }
        }
        /*
        while loop to print
        2000
          2001
          ....
          2049
        3000
           3001
           3002
           3049
       4000
           4001
           4049
       5000
           5001
         */
        int b = 2000;
        while (b <=5000){
            System.out.println(b);
            int c = b+1;
            while (c <= b +49){
                System.out.println(" " +c);
                c++;
            }
            b+=1000;
        }
        System.out.println("Wohoo, i am done");

        int j = 1;

        while (j <= 6){

            int k = 1;
            while (k <= j){
                System.out.print(k);
                k++;
            }
            System.out.println();
            j++;
        }


        int digit = 1;
        while(digit < 10){
            System.out.println("Multiplication table for:" +digit) ;

            int digit2 = 1;
            while (digit2 < 10){
                System.out.println(digit + " * " + digit2 + " = "+ (digit*digit2));
                digit2++;
            }
            digit++;
        }
        for (int t = 1; t <= 10; t++){
            System.out.println("Multiplication table for:" +t);

            for(int f =1; f<=10; f++) {
                System.out.println(t + " * " + f+ "=" +(t*f));

            }
        }

        int number1 = 1;
        do {
            System.out.println("Multiplication table for:" + number1);
            number1++;

            int number2 = 1;
            do{
                System.out.println(number1 + "*" + number2 +"=" +(number1 * number2));
                number2++;
            }while (number2<=10);

            number1++;
        }while (number1 <=10);

        for (int i = 1; i <=10; i++){
            System.out.println("For Loops: Mltiplication table for:" + i);
            for (int k = 1; k<=10; k++){
                System.out.println(i+ " * "+ k + " = "+ (i+k));
            }
        }

        int num1 = 1;
        do {
            int num2 =1;
            if(num1 % 2==0){
                do{
                    System.out.print(num1);
                    num2++;
                }while (num2 <= num1);
                System.out.println();
            }else {
                System.out.println(num1 +" is odd");
            }
            num1++;

        }
            while(num1 <=10);
    }
}
