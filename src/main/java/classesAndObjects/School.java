package classesAndObjects;

public class School {
    String city = "Chicago";
    String country;

    public static void main (String [] args){

        Student object1 = new Student();
        Student object2 = new Student();

        object1.firstName = "Gulmira";
        object1.lastName = "Abdulakhat kyzy";
        object1.major = "Testing";
        object1.yearOfStudy = 2022;

        object2.firstName = "Bena";
        object2.lastName = "Bai";
        object2.major = "Programming";
        object2.yearOfStudy = 2017;

        System.out.println(object1.firstName);
        System.out.println(object1.lastName);

        object1.reads();
        object1.writes();
        object1.visitsClass();

        object2.writes();
        object2.reads();
        object2.visitsClass();

        object1.isHomeworkDone();
        object2.isHomeworkDone();






    }


    public void doSomething(){
        country = "USA";
        String state = "IL";
        System.out.println(city);
        System.out.println(country);
    }


    public void dontDoAnything(){
        country = "Russia";
        System.out.println(city);
        System.out.println(country); //null
    }


}
