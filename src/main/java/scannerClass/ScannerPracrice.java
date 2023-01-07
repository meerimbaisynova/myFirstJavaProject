package scannerClass;

import java.util.Scanner;

public class ScannerPracrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);
        float newFloat = sc.nextFloat();
        System.out.println("newFloat = " + newFloat);
        byte myByte = sc.nextByte();
        System.out.println("myByte = " + myByte);
        long toLong = sc.nextLong();
        System.out.println("toLong = " + toLong);
        short isShort = sc.nextShort();
        System.out.println("isShort = " + isShort);
        Scanner scannerForString = new Scanner(System.in);
        String str = scannerForString.nextLine();
        System.out.println("str = " + str);
        boolean isBoolean = sc.nextBoolean();
        System.out.println("isBoolean = " + isBoolean);
        double double1 = sc.nextDouble();
        System.out.println("double1 = " + double1);
        char c = sc.next().charAt(0);
        System.out.println("c = " + c);


    }


}


