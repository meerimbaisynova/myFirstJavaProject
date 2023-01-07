package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsEmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>();
        boolean isListEmpty = companies.isEmpty();

        System.out.println("Is companies list empty?" + isListEmpty);

        companies.add("Google");
        companies.add("Microsoft");
        companies.add("Cisco");
        companies.add("Oracle");
        companies.add("Uber");
        companies.add("Slack");
        companies.add("Apple");
        companies.add("Netflix");

        isListEmpty = companies.isEmpty();
        System.out.println(isListEmpty);  // false

        String[] arrayOfCompanies = new String[companies.size()];
        companies.toArray(arrayOfCompanies);

        System.out.println(Arrays.toString(arrayOfCompanies));

        /*
        confert Array  to ArrayList
         */
        String[] geeks = {"Saikal", "Myrzakan", "Ilgiz", "Zhamal"};
        List<String> arrayListGeeks = Arrays.asList(geeks);
        /*
        convert arrayListGeeks to Array
         */
        String[] arrayOfGeeks = new String[arrayListGeeks.size()];
        arrayListGeeks.toArray(arrayOfGeeks);
        /*
        another way

         */
        String[] testers = {"Daniel", "Aichurok", "Nazima", "Meerim"};
        List<String> al = new ArrayList(Arrays.asList(testers));
        System.out.println(al);


        for (String tester : testers) {
            System.out.println("for each :" + tester);
        }

        int i = 0;
        while (i < al.size()) {
            System.out.println("while loop " + al.get(i));
            i++;
        }
    }}


