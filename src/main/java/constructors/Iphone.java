package constructors;

public class Iphone {
    public Iphone(){
        System.out.println("inside constuctor");
        this.color = "space gray";
        this.memory = 128;
        this.price = 999.99;
        this.isUnlocked = false;
    }
    public Iphone(int memoryFromParam){
        System.out.println("this iphone has " + memory + "Gb memory");
        this.memory = memory;
    }
    public Iphone(String color){
        System.out.println("This iphone is " + color);
    }

    String color;
    int memory;
    double price;
    boolean isUnlocked;


    public static void main(String[] args) {
        Iphone object1 = new Iphone();
        Iphone object2 = new Iphone();
        Iphone iphone14ProMax = new Iphone();
        Iphone iphone13Promax = iphone14ProMax;

        Iphone iphoneSE = new Iphone(256);
        Iphone iphoneX = new Iphone(128);  //this iphone has
        Iphone iphone12Pro = new Iphone();

        System.out.println(new Iphone(512)); //  this  iphone has: 512 Gb memory , object
        System.out.println(new Iphone(512));

        System.out.println(iphoneX);  // Object ID
        System.out.println(iphoneX);  // Object ID
        System.out.println(iphone14ProMax.color);  // space color
        System.out.println(iphone14ProMax.memory = 512);  // 512
        System.out.println(iphone14ProMax.memory);  // 512


        Iphone mobile = new Iphone();
        System.out.println(mobile.price);  // 999.99
         mobile.isUnlocked = true;
        System.out.println(mobile.isUnlocked);
        System.out.println(new Iphone(8333)); // this iphone has 8833
        // object ID



        {

        }


    }
}
