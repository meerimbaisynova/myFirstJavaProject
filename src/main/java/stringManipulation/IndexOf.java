package stringManipulation;

public class IndexOf {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(str.charAt(3));
        /*
        charAt(int index) takes an integer
        and returns char behind that integer
        can only be used by String

        indexOf(char c), method belongs to String class
        takes a char in single quotes, returns the index
        of this char
        a = 0, b = 1, c = 2, d =3
         */

        System.out.println(str.indexOf('c'));
        System.out.println(str.charAt(2));
        int index = str.indexOf('g');

//        ========== what if string has 2 or more same letters

        String str2 = "abcaccdeelaab";
        System.out.println(str2 + ": " + str2.indexOf(' '));
        int index2 = str2.indexOf(' ', 5);
        System.out.println(index2);

        str2.indexOf('c'); //if indexOf takes one char, it returns the index of that char

        int i = str2.indexOf("dee"); //if indexOf takes one String,
                            // it returns the index of first char of that String
        System.out.println("index of dee: " + i);

//==============================================

        String state = "u - Con ne14 c7%#@! ticut1412";

        System.out.println(state.indexOf('o'));
        System.out.println(state.indexOf("nnecticut"));

        System.out.println(state.indexOf('u', 10));
        System.out.println(state.indexOf("14", 20));

        String city = "New York";

        System.out.println(city.charAt(2));

        /*
        isEmpty(), checks whether the string is empty or not
        and returns true if its empty, and false if not empty
         */

        String name1 = "Hello Codewise";
        String name2 = "";
        String name3 = "%";
        String name4 = " ";

        System.out.println(name1.isEmpty()); //false
        System.out.println(name2.isEmpty()); //true
        System.out.println(name3.isEmpty()); //false
        System.out.println(name4.isEmpty()); //false
        System.out.println((name1 = name2).isEmpty()); //true
        System.out.println(name1.isEmpty()); //true


















    }
}
