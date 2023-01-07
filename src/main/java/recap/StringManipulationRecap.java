package recap;

public class StringManipulationRecap {

    public static void main(String[] args) {
        speeding(50, false);

        String str = "sdfsd";




    }


    /*
    return 0 if its birthday or speed < 60
    if more than 60 return 1 - ticket and not birthday
     */
    public static int speeding(int speed, boolean isBirthday) {

        if(isBirthday){
            System.out.println("no ticket");
            return 0;
        }

        else if (!isBirthday){
            if(speed > 60){
                System.out.println("you get ticket");
                return 1;
            }else{
                return 0;
            }

        }


        return 0;
    }



}
