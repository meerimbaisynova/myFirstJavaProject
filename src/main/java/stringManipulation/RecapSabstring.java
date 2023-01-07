package stringManipulation;

public class RecapSabstring {
    public static void main(String[] args) {
        String animals = "dog, cat, monkey";
        String dog = animals.substring(0,3);

        String cat = animals.substring(animals.indexOf("cat"), animals.indexOf("cat") + "cat ".length());
        System.out.println(cat);

        String monkey = animals.substring(animals.indexOf("monkey"));
        System.out.println(monkey);

        String rules = "Index method returns us index of the given char";
    }
}
