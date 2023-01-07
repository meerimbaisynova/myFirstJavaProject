package recap;

public class RecapOperators {
    public static void main (String[] args){
        int num1 = 10;
        int num2 = 30;
        int sum = num1+num2;
        System.out.println(sum);  // 40

        num1 = 25;
        System.out.println(num1);   //25

        sum = num2 - num1 ; //5
        System.out.println(sum);

        System.out.println(20+5*3);   //35
        System.out.println(2 * 3 / 2 + 10);    // 13
        System.out.println(10+20+5*2-40/2);    //20

        /*
        % modulus , arithmetic operator , that returns us remainder after division
        10 / 3 = 3.3333;
        10% 3 = 1 ;
        7 / 3 = 2.333
        7 % 3 = 1; remainder

        20 % 4 = 0;
        10 % 5 = 0;
        10 % 6 = 4
        100 % 30 = 10 ;
        100 % 90 = 10 ;
        100 % 40 = 20 ;

         */
        System.out.println(9%2);
        System.out.println(10 % 2);

        System.out.println(2+3*2);    //8
        System.out.println((2+3)*2);  //10




        int digit = 20;
        int digit2 = 10;
        System.out.println(digit+digit2);

        System.out.println("abd:" + digit + digit2);  // abd : 2010
        System.out.println(digit + digit2 + " abd");  // 30abc

        String myName = "Meerim";
        String myLastName = "Baisynova";
        int myAge = 32;
        System.out.println("Hello ! My name is "+ myName +" " + myLastName + " " + " "+  myAge + " " + "years old");

        String herName = "Erika";
        String herLastName = "Nurbekova";
        String herAge = "7";
        System.out.println("Salam ! menin atym " + herName + " " + " menin vamiliam " + herLastName +  " "+ "menin jawym " + herAge);

    }
}
