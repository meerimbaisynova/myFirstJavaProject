package classesAndObjects;

public class Computer {
    public static void main(String[] args) {
         Computer computer= new Computer("Samsung" );
         computer.newcomputer();
    }

    String name;

    public void newcomputer(){
        System.out.println("This computer  name is: " + name);
    }


    public Computer(String name){
        this.name = name;
    }





}
