package classesAndObjects;

public class User {

    String username;
    String password;
    String email;
    String dateOfBirth;
    String gender;
    int phoneNumber;
    boolean isPrivate;
    int numOfFollowers;
    String lastMessage;

    /*
    method is a function used to expose behavior of an object

    public is access modifier
    username, password = method parameters
     */

    public void login(String username, String password){
        System.out.println(username + " logged in using password: " + password);
    }

    public int getNumberOfFollowers(String username){
        return numOfFollowers;
    }

    public String getLastMessage(String username){
        System.out.println("this is your last message");
        return lastMessage;
    }

    public boolean isPrivateAccount(String username){
        return isPrivate;
    }

    public String todaysDate(){
        return "30 November 2022";
    }

    public void likePost(String username, String post){
        System.out.println(username + " liked " + post);
        System.out.println(username + " liked " + post);
        System.out.println(username + " liked " + post);
        System.out.println(username + " liked " + post);
        System.out.println(username + " liked " + post);
        System.out.println(username + " liked " + post);
        System.out.println(username + " liked " + post);

    }

    public void signIn(){

    }

    public void signInWithPhone(String phone){

    }

    public void addToCart(int quantity, String color){

    }

    /*

    Create Car class with variables:
    tires, wheel, window, lights, color, year, price

    Inside Car class, create methods:
    drive, stop, heat, cool, playMusic, isExpensive

    Create Garage class and inside create 4 objects out of Car class:
    Mercedes, Range Rover, Lexus, Toyota

    Assign values to each variable of each object, print them all
    and call all methods for each object



     */


    /*
    Create 10 empty methods
    void
    String
    byte
    short
    int
    long
    double
    float
    char
    boolean

    Use any method name,
     */

    public void sampleMethod(){

    }

    public byte byteMethod(){
        byte b = 2;
        return b;
    }










}
