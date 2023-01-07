package loops;

public class ForLoop2 {
    public static void main(String[] args) {
        //create a loop that will print number from 0 to 30
        //if a number


        for(int i =0; i<=30; i++){
            if (i%3 == 0){
                System.out.println(i +"- divisible");
            }else {
                System.out.println(i);
            }
        }
    }

}
