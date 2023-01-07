package methodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {

    }
    public static int sum(int a, int b){
        return  a+b;
    }
    /*
    create method , which takes 2 doubles and return their sum us int
     */
    public static int sum (double a , double b ){
        return  (int) (a+b);
    }

    public static float sum(float a, float c){
        return  (int) (a+c);

    }
    public static int sum(int a, int b,int c){
        return a+b+c;

    }
    public static int sum(float a,float x, float y){
        return (int) (a + x + y);
    }
    public static  String stringMethod(String [] arr, int a, int b, boolean x){
        return "";
    }
    public static String stringMedhod( int a,double v, String name, String lastname,
                                       int [] arr){
        return name;
    }
    public static String stringMethod(String a,String b, String c, String d,String e,
                                      String f, String g, String h, String i,String j){
        return  a;


    }
}
