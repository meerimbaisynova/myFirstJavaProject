package classesAndObjects;

public class Zoo {
    public static void main (String [] args){

        Animal elephant = new Animal();//1234566778
        Animal lion = new Animal(); //1234566779
        Animal mouse = new Animal(); //1234566710
        Animal chicken = new Animal();

        String str = "abc";
        String str1 = new String("abc");

        elephant.type = "elephant";
        elephant.color = "gray";
        elephant.size = "large";
        elephant.name = "Dumbo";

        lion.type = "cat";
        lion.color = "yellow";
        lion.size = "medium";
        lion.name = "Alex";

        // METHODS, ACTIONS, FUNCTIONALITIES
        elephant.eats();
        elephant.sleeps();

        lion.plays();
        lion.eats();






    }

}
