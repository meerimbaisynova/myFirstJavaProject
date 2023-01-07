package loops;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while (j<=100);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i<n; i++);
        int num = scan.nextInt();
        if (num%2 !=0 && num >=0){
            System.out.println("ODD POSITIVE");
        } else if (num %2 == 0 && num <0) {
            System.out.println("EVEN NEGATIVE");
        } else if (num%2 !=0) {
            System.out.println("ODD NEGATIVE");
        } else if (num>0) {
            System.out.println("EVEN POSITIVE");
        }else{
            System.out.println("NULL");
        }


}
        }

