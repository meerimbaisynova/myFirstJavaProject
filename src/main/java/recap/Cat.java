package recap;

public class Cat {

    String breed;
    String color;
    byte age;
    double price = 2500;


    public void eats(){
        System.out.println(color + " " + breed + " cat is eating");
    }


    public void sleep(){
        System.out.println(color + " " + breed + " cat which is " + age + " years old is sleeping");
    }


    public void tellPrice(){
        System.out.println(color + " " + breed + " costs " + price +" dollars");

    }




}
