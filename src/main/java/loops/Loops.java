package loops;

public class Loops {
    public static void main(String[] args) {
        checkEvenOrOdd(101);
        checkEvenOrOdd(4);
        printEachLetter("Kennedy");
        String title = "";

        String tit = "Ok Class. We done!";
        printEachLetter(tit);

        //create public static method
    }
    public static void checkEvenOrOdd(int number){
        if(number % 2 == 0){
            //even
            for (int i = 1; i<=30; i++){
                System.out.println(i + ". Hi");
            }
        }
        else{
            //odd
            for (int i = 0; i < 30; i++){
                System.out.println((i+1)+ " .Hello");
            }
        }

    }
    public static void printAllNumbers(int number){
        printAllNumbers(45);


        if (number > 0 ){
            // print numbers
            for (int i = 0; i <=number; i++){
                System.out.println();
            }
        }
        else {
            // number is negative
            System.out.println( "Invalid number. Please try again");
        }
        // Create a method that accepts s String and prints each letter separately on a new line
        // Psedo
        // 1.Method signature
        // 2.Run a loop that runs the length amount of times of giving string
    }
      public static void printEachLetter(String word){
        if(word.isEmpty()){
            System.out.println("Invalid data.String cannot be empty");
        }else {
        for (int i = 0; i < word.length(); i++){
            // get each character from string
            char c = word.charAt(i);
            System.out.println(c);
        }
      }
      String title = "Table";
      char ch = title.charAt(0);
      char end = title.charAt(title.length()-1);

    }
}




