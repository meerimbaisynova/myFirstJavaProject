package recap;

public class VariablesRecap {
    public static void main(String[] args) {
        /*
        variable is a container for storing data
        primitive data type
        In Java, there are 8 primitive data types
         */

        byte anything = 22;  //-128 to 127
        byte anything2 = 127;  //variable declaration

        //you cannot have 2 variables with same name

        anything = -128;
        System.out.println(anything);

        /*
        short is a variable that stores numbers from
        -32,768 to 32,767
         */
        short number = 899;
        number = 32767;
        System.out.println(number);

        /*
        int - integer, is a variables that stores numbers
        from -2 bil to 2 bil
         */

        int iphone = 1000;
        int samsung = 2000;

        // = is assignment operator, it takes value
        // from right side and puts it into left side
        iphone = samsung;
        iphone = 1243134;
        iphone = 1232;
        iphone = 1500;

        System.out.println(iphone);

        /*
        long is a variable type that stores numbers from
        very long numbers
         */

        long distance = 1232410000999L;
        distance = iphone;

        /*
        float and double are variables that
        store fractional numbers.

        double is bigger than float
        double can store up to 15 decimal
        while float can store up to 7 decimal
         */

        float priceOfBread = 2.99f;

        double priceOfAvocado = 1.99;

        priceOfAvocado = priceOfBread;
        System.out.println(priceOfAvocado);

        /*
        boolean is a variable that stores either
        true or false
         */

//      data type    name   = value;
        boolean isTrue = true;
        int a = 1;
        int b = 3;

        isTrue = 1 < 3;
        isTrue = 3000+1000 > 2000;


        System.out.println(isTrue);
        boolean bb = 100 > 10;
        System.out.println(bb);
        bb = false;

        /*
        char - is a variable that stores one character
        any letter uppercase, lowercase, numbers, special characters
        and you need to put char in single quotes
         */

        char ch = 127;
        char ch2 = 'b';

        System.out.println(ch);

        /*
        String is a non-primitive data type
        it is a sequence of character
         */

        String name = "provide any text here. Even 2324242 %%@42%";

        System.out.println(name);

        System.out.println(32423);
        System.out.println(true);
        System.out.println('a');
        System.out.println(45.77);
        System.out.println("this is my string!!!");

        // variable declaration
        String myName = "Benazir";


        String firstName = "Bena";
        String lastName = "Baialieva";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        int age = 26;

        System.out.println("Hello! My name is " + fullName);
        System.out.println("I am " + age + " years old!");










    }
}