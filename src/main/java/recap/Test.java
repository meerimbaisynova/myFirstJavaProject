package recap;

public class Test {

    /*
    1. variables (to store data)
    2. methods (actions, functionality)
     */

    public int variable1;
    String variable2;

    public void printAmericanFlag(int numberOfFlags){

        if(numberOfFlags == 1) {
            System.out.println("******-------------");
            System.out.println("******-------------");
            System.out.println("******-------------");
            System.out.println("-------------------");
            System.out.println("-------------------");
        }
        else if(numberOfFlags == 2) {
            System.out.println("******-------------  | ******-------------");
            System.out.println("******-------------  | ******-------------");
            System.out.println("******-------------  | ******-------------");
            System.out.println("-------------------  | -------------------");
            System.out.println("-------------------  | -------------------");
        }

        System.out.println("The flag was printed");
    }



}