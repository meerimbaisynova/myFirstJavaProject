package loops;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i=0; i<=10; i++){
            System.out.println("Hello");
        }

        int j =1;
        while ( j<=10){
            System.out.println("hi");
            j++;
        }


       int k = 1;
        do {
            System.out.println("bye bye");
            k ++;
        } while (k>10);


        for (int i =1; i <=3; i++){
            System.out.println("WEEK: " +i) ;

            for (int a =1 ; a<=7; a++){
                System.out.println("day:" +a);
            }
        }
        /*
        create nested for loop , print 12 month and 30 days in each of the mounth
        1 mounth
        1day
        2 day
        30 day
        2 mounth
        1 day
         */
        for (int b = 1; b<=12; b++){
            System.out.println("MONTH" +b);

            for( int s = 1; s<=30; s++){
                System.out.println(" day " +s);

            }
        }
        /*
        **
        ***
        ****
        *****
        ******
        ********
        *********
        **********
        use nested for loop
         */



        for(int u =1; u < 7;  u++){
            for (int e=1; e <=7-u;  e++){ // print spaces
                System.out.println(" ");
            }
            for(int v =1; v <= u * 2 -1; v++){
            System.out.println("* ");
        }
            System.out.println();
        }
        System.out.println("!!! HAPPY NEW YEAR !!!");

    }
}





