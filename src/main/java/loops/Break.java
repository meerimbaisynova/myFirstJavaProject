package loops;

public class Break {
    public static void main(String[] args) {
        /*
        break is java keyword which is used to jump out of loop, to break loop it can be used
         */
        for( int i = 1; i <= 10; i++){
            if (i == 8){
                break;
            }
            System.out.println(i);
        }
        System.out.println("code after for loop");

        // print numbers from 20 to 30
        int n = 20;
        while (n<30){
            System.out.println(n);

            if( n == 25){
                System.out.println("Reached 25, breaking while loop");
                break;
            }
            n++;
        }
        /*
        print numbers from 5000 to 10000
        if number == 5020 , break
        use do while loop
         */
        int j = 5000;
        do{
            System.out.println(j);
            if ( j == 5020){
                break;
            }
            j++;
        }while (j < 10000);

                };
            }

