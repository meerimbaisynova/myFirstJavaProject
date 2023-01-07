package methodOverloading;

public class OverloadedCalculator {
    /*
    create:
    3 addition methods: 2 int params, 3 int params, 2 doubles param
     */
    public static double addition(int a, int b){
        return a+b;
    }
    public static double addition (int a, int b,int c){
        return  a+b+c;

    }
    public static double division(int a, int b){
        return a/b;
    }
    public static double division (int a, int b, int c){
        return a/b/c;
    }


    public static void main(String[] args){
        System.out.println(addition(5,10));
        System.out.println(addition(4,8));
    }
}
