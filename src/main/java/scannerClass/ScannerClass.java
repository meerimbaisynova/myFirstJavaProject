package scannerClass;

import recap.Test;

import java.util.Scanner;

public class ScannerClass {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);


        Test obj = new Test();
        obj.printAmericanFlag(2);


    }}
