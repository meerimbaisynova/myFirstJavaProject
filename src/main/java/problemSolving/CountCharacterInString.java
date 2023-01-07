package problemSolving;

public class CountCharacterInString {
    public static void main(String[] args) {
        countCharInString("mama", 'a');
        countCharInString("colorado",'o');
        countCharInString("code" , 'b');
    }

    /* Create a method that takes one String , and one Char
    returns int
    returns us the number of times that char occurs in the String
    mama , a => 2
    colorado , 0 =>
    codewise , w =>
    ohio, a =>0

     */
    public static int countCharInString(String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == letter){
        count ++;
    }
}
        System.out.println(count);
return count;
    }
}