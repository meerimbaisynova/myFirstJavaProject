package homeWork;

public class ReserveString {
    public static void main(String[] args) {
        reverse("Codewise");
        reverse("Mama");
        reverse("hello");


        //codewise  ==> esiwedoc
        //mama  ==> amam
        //hello ==> olleh

    }

    public static String reverse (String str ){
        String  reversed = "";
        for (int i = str.length()-1; i >=0; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;


}}
