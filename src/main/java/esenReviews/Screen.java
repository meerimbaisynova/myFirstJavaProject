package esenReviews;

public class Screen {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        int c = 50;

        // What would be the condition for "a" to be maximum?
        // a>b also a>c ==> a is the max
        if (a>b && a>c){
            System.out.println("Max is: " +a);
        }
        else if (b> a && b>c){
            System.out.println("Max is: " +b);
        }
        else if (c>a && c>b){
            System.out.println("Max is: " +c);
        }
        else {
            System.out.println("They are all equal!");
        }
    }
}
