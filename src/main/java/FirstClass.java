public class FirstClass {

    public static void main(String[] args) {
        /*    1) given: int a = 100; int b = 200;
        write a program that will print the sum of two variables.
          */
        String name = "Hello Codewise!";
        System.out.println("Good luck for you!:" + name + "all the best ! ");

        int n = 5;
        int num2 = 2;
        System.out.println(n != num2);

        int me = 5;
        int me1 =5;
        System.out.println(me == me1);

        int a =100; int b= 200;
        int sum= a+b;
        System.out.println( " The value of a and b =  "  + sum);

        /*2) given int q = 5; int w = 9, int e = 10;
             write a program that will print the sum of all three variables.
           */
        int q= 5; int w=9; int e=10;
        int  sum1= q+ w+ e;
        System.out.println(" The value of q, w,e =  " + sum1);

        System.out.println("=======================================================");

        /*3) using operators and variables, write a program that will print following lines of code:

1 + 2 = 3
3 - 1 = 2
2 * 2 = 4
4 / 2 = 2
2 + 8 = 10
10 % 7 = 3

         */
        int  num= 1+2;
        System.out.println("1+ 2= " +num); // 1 + 2 = 3

        int num1= 3-1;
        System.out.println("3- 1= " + num1); // 3 - 1 = 2

        int qq= 2*2;
        System.out.println("2* 2 = "+ qq);//  2 * 2 = 4

        int num3= 4/2;
        System.out.println("4/2 = "+ num3);//  4 / 2 = 2

        int num4 = 2+8;
        System.out.println("2+8= " +num4);// 2 + 8 = 10

        int num5= 10%7;
        System.out.println("10 % 7 = "+ num5); //10 % 7 = 3

    /*4) Length and width of a rectangle are 9 and 15 respectively.
     Write a program to calculate the area and perimeter of the rectangle. Print results as following:
    The area of a rectangle is:
     The perimeter of rectangle is:

     */

        int  recLenght=9;
        int  recWidth= 15;
        int perimeterOfRec = 2*(recWidth + recLenght);
        int areOfRec=recLenght * recWidth;
        System.out.println(" The area of a rectangle is: " + areOfRec);
        System.out.println(" The perimeter of rectangle is: " + perimeterOfRec);


        System.out.println("===============================================================");

/*   5) Write a program to add 8 to the number 2345 and then divide it by 3.
    Now, the modulus the total sum with 5 and then multiply the result value by 5.
    Print the final result as following:
    The result:

 */      int number = 8 + 2345 /3 %5 * 5;
        System.out.println("The result:" + number);

        // 6) Now, solve the above question using assignment operators (eg. +=, -=, *=).

        int  summary =2345;
        summary /=3; // 2345 / 3
        System.out.println(" the result :" + summary);

        summary %=5; // 781 % 5
        System.out.println("the result is : " +summary);

        summary *= 5;
        System.out.println(" the result is :" + summary);

        summary += 8;
        System.out.println("the result is :" + summary);
        System.out.println("============================================================");

        //7) Write a program to check if the two numbers 23 and 45 are equal.

        boolean number1= 23==45;
        System.out.println(number1);// false condition
        System.out.println("============================================================");

        // 8) Write a program to check if the two numbers -10 and 10 are equal.

        boolean number2= -10 == 10;
        System.out.println(number2); // false

    }


}




