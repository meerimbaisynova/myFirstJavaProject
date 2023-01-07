package loops;

public class HomeWork {
    public static void main(String[] args) {

        int k = 1;
        for (int counter = 1; counter <= 5; counter++) {

            for (int i = 1; i <= counter; i++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
/*write a program using nested for loop, that will print the following output. It's called Floyd's Triangle.

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
     */
