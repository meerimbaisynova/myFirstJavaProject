package staticPackage;

public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher1.name = "Nicola Tesla";
        teacher1.hasDegree = true;
        teacher1.age = 45;
        teacher1.salary = 4900;
        teacher1.workplace = "Codewise";

        teacher2.name ="Albert Einstain";
        teacher2.hasDegree = false;
      //  teacher2
      //  teacher2

        System.out.println(teacher1.name);  //Nicola Tesla
        System.out.println(teacher1.age);   //45
        System.out.println(teacher2.age);   //0
        System.out.println(teacher2.workplace);  //Codewise

        teacher2.workplace ="Harvard";

        System.out.println(teacher1.workplace);  // Harvard

        Teacher.workplace ="Columbia";

        System.out.println(teacher2.workplace);  // Columbian

        Teacher teacher3 = new Teacher();
        Teacher teacher4 = new Teacher();

        System.out.println(teacher3.name);   // null
        System.out.println(teacher3.city);  //
        System.out.println(teacher3.workplace); // Columbian
        System.out.println(teacher4.year);  // 0

        Teacher.city = "New York";
        Teacher.year = 2022;

        teacher4.year = 2023;






    }
}
