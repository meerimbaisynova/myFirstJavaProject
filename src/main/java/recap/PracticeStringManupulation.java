package recap;

public class PracticeStringManupulation {
    public static void main(String[] args) {

        /*
        indexOf() this method is used only by String , and it takes one char and returns us the index of the given char
         */
        String name = "Meerim";
        System.out.println(name.indexOf('m'));
        System.out.println(name.indexOf('M'));
        System.out.println(name.indexOf('e',3));

    }
}
