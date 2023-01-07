package stringManipulation;

public class PracticeHomeWork {

     /*

1. write a program that compares values of hello1 and hello2

2. write a program that compares values of hello1 and hello3

3. write a program that compares of hello1 and hello2 are same objects

4. write a program that compares hello1 and hello2 and make sure the result will be true

5. convert hello1 and hello2 to all lower case and compare them

 */
     public static void main(String[] args) {
         String hello1 = "Hello World";
         String hello2 = "Hello World";
         String hello3 = new String("Hello Wolrd!");

         boolean b=hello1.equals(hello2);
         System.out.println(b);


         boolean isEqual = hello1.equals(hello3);
         System.out.println(isEqual);

         boolean isSameObject = hello1.equals(hello2);
         System.out.println("This object is same object: " + isSameObject);

         boolean isTrue = hello1.equals(hello2);
         System.out.println( isTrue);

         String myName = "Hello World!";
         String myName2 = "Hello world!";
         String myNameToLower = myName.toLowerCase();
         String myName2ToLower = myName2.toLowerCase();
         System.out.println(myNameToLower.equals(myName2ToLower));
         myName = myName.toLowerCase();

         System.out.println(myName.toLowerCase().equals(myName2.toLowerCase()));
         System.out.println(myNameToLower);
         System.out.println(myName);



         String Meerim = "Happy end ";
         System.out.println(Meerim);
         Meerim.charAt(Meerim.length()-1);



     }


}
