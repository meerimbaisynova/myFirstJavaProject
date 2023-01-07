package constructors;

import java.util.concurrent.Callable;

public class ConstuctorsIntro {
    public  ConstuctorsIntro(){
        System.out.println("Hello! I am a constructor");
    }

    public ConstuctorsIntro(String name){
        System.out.println("Hello " + name + "!This is another constuctor with one argument");
    }



    public static void main(String[] args) {
        ConstuctorsIntro object1 = new ConstuctorsIntro();
        ConstuctorsIntro object2 = new ConstuctorsIntro();
        ConstuctorsIntro object3 = new ConstuctorsIntro("Codewise");
        ConstuctorsIntro object4 = new ConstuctorsIntro("Bishkek 312");

            }



            public ConstuctorsIntro(String name, int age){
                System.out.println("Hello" + name + "! i am " + age);

            }
    }

