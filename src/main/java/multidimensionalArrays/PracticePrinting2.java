package multidimensionalArrays;

public class PracticePrinting2 {
    public static void main(String[] args) {


        String[] numbers = {"12", "45", "56", "234"};
        String[] words = {"sun", "earth", "jupiter", "moon"};

        String[][] twoDimenArr = {numbers, words};
        /*
        use for loop to print the values
         */
        for (int i = 0; i < twoDimenArr.length; i++) {
            for (int j = 0; j < twoDimenArr[i].length; j++) {
                System.out.println(twoDimenArr[i][j] + " ");

            }
        }
        /*
        print only words , no numbers
         */
        System.out.println();
        for (int j = 0; j < twoDimenArr[0].length; j++) {
            System.out.println(twoDimenArr[0][j] + " ");
        }
        // =============================
    /*
    Arrays.tostring (arrName) = only works with one dim arrays
    for each loop work with primitive data types, only with non primitive data types
     */
        String[] toDoList = {"grocery shopping ", "clean house", "study", "play with kids",};
        for (String task : toDoList) {
            System.out.println("inside for each loop :" + task);
        }
        int[] arr = {12, 2, 3, 4, 5, 5, 8};
        for (int a : arr) {
            System.out.println(a);
        }
        double[] prices = {20, 40, 3.9, 2, 9.9};
        for (double cost : prices) {
            System.out.println(cost);
        }
/*
       Create 4 string arrays
       and put them all inside one two dimensianal array
       using loop , print all values
       inside for loop create for each loop
 */
        String[] girlNames = {"Aizada", "Meerim", "Kanykey"};
        String[] boyNames = {"Nurbek", "Urmat", "Aibek"};
        String[] colors = {"green", "white", "red"};
        String[] seasons = {"summer", "winter", "Spring"};

        String[][] twoDimArr = {girlNames, boyNames, colors, seasons};

        for (int i = 0; i < twoDimenArr.length; i++) {
            for (String str : twoDimenArr[i]) {
                System.out.println(str + " ");
            }
            System.out.println();
        }


        /*
        create 4 String one dim arrays
        create 2 String twp dim arrays
        create 1 String three dim array
         */
        String[] madrid = {"madrid", "ronaldo", "carlos"};
        String[] barselona = {"mersi", "redo", "carl"};
        String[] psg = {"mess", "mhappe", "alexos"};
        String[] manut = {"sko", "rsdjd", "hela"};

        String[][] total = {madrid, barselona};
        String[][] total1 = {psg, manut};
        String[][][] total2 = {total, total1};

        for (int i = 0; i < total2.length; i++) {
            for (int k = 0; k < total2[i].length; k++) {
                for (String name : total2[i][k]) {
                    System.out.println(name + " ");
                }
            }
        }}
}


