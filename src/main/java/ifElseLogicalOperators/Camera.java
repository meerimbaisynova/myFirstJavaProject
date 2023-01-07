package ifElseLogicalOperators;

import java.util.Random;

public class Camera {
    public static void main(String[] args) {
        Random random = new Random();
        int thatRandom = random.nextInt(101);
        System.out.println(thatRandom);

        for (int i = 0; i<101; i++){
            if ( i == thatRandom);
            System.out.println("i found the number: " + i);
            break;
        }
    }
}
