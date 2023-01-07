package loops;

public class FoorLoopHomeWork {
    public static void main(String[] args) {
       // 1. create a loop that prints all December days from
       // 1 to 31:
       // 1 December 2022
       //  2 December 2022
       //  3 December 2022
       // 31 December 2022

        for (int i = 1; i <=31; i++){
            System.out.println(i + "December 2022");
        }


        //2. create a loop that prints all even numbers from 1 to 200:
       // even: 2
       // even: 4
       // even: 6
       // even: 200

       for (int i = 1 ; i <=200; i++){
           if(i % 2 == 0)
        System.out.println(i + " - even");
}

       // 3. create a loop that prints all odd numbers from 100 to 1:
       // 99 - odd
       // 97 - odd
        // 1 - odd
        for (int i = 100; i >= 1; i--){
            if(i % 2 == 1)
        System.out.println(i + "odd");
        }

           /*
        4. create a loop that prints all the values divisible by 7 in the range of 1 to 100 in reverse order.
        98
        91
        84
         7
         */
        for (int i = 100; i>=1; i --) {
            if (i % 7 == 0)
                System.out.println(i);
        }
    }

}
