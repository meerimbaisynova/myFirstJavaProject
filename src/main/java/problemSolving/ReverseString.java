package problemSolving;

public class ReverseString {
    /*
    create a method , that takes one String and returns reserved
     */
    public static void main(String[] args) {
        reverse("Hello everyone!");
        reverse("MAMA");
        reverse("Hello");

    }
    public static String reverse (String str ){
        String  reversed = "";
        for (int i = str.length()-1; i >=0; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;

    }

    }



