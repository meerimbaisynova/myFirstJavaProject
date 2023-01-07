package constructors;

public class InstagramApp {
    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("James Bond", "jb2022", "JB2022!");

        user1.display();

        InstagramUser user2 = new InstagramUser("John Wick", "jw20", "Wick22", "I am an actor");
        user2.display();

        InstagramUser user3 = new InstagramUser("Cristiano Ronalno", "ronaldo", "CR7", "Football is life", "cr.com");
        user3.display();

        String name = "James";
        String title = " 7 habits";

        title = name;
        System.out.println(name);
        System.out.println(title);

        user2.postStory("I coming back!");
        user1.postStory("Game is on today ");

        user3.visitProfile(user1);
        user3.visitProfile(user2);
        // james Bond want to make his profile private
        user1.isPrivate = true;
        System.out.println();

        user3.visitProfile(user1);
        user3.visitProfile(user2);

        // I want to print "7 Habits "
        // We cannat . We lost it when we were reasigning the value for title
        // " 7 habits " text has no reference anymore


    }

}
