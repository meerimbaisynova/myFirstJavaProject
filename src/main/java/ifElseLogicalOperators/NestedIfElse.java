package ifElseLogicalOperators;

public class NestedIfElse {
    /*
You are driving a little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value:
0=no ticket, 1=small ticket, 2=big ticket.
If speed is 60 or less, the result is 0.
If speed is between 61 and 80 inclusive, the result is 1.
If speed is 81 or more, the result is 2.
Unless it is your birthday -- on that day, police will not
give you any ticket.
*/
    public static void speeding(int speed, boolean isBirthday){
        if (!isBirthday){
            if (speed > 60 && speed <= 80){
                System.out.println("You get small ticket");
            }else if (speed > 80){
                System.out.println("You get big ticket");
            }else if(speed <= 60){
                System.out.println("No ticket");
            }
        }else{
            System.out.println("No ticket");
        }
    }

    public static void main(String[] args) {
        speeding(90, true);
        speeding(81, false);
        speeding(60, false);
    }

}
