package stringManipulation;

public class StringManupilationHomeWork {
    public static void main(String[] args) {
        String message = "Hello everyone, Let's do Java String exercises";
        System.out.println("character at position "+message.indexOf('y')+" is y");
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(5));
        System.out.println(message.charAt(6));
        System.out.println(message.charAt(7));
        System.out.println(message.charAt(message.length()-1));
        System.out.println(message.charAt(message.length()-2));
        System.out.println(message.toLowerCase().charAt(0));
        System.out.println((message.charAt(0) + "").toLowerCase());
        System.out.println((message.charAt(-1)+"").toUpperCase());


    }
}
