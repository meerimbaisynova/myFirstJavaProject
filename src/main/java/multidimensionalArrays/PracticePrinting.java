package multidimensionalArrays;

public class PracticePrinting {
    public static void main(String[] args) {

        String [][] strArr = new String[][]{
                { "plov", "blinchiki", "shashlyk"}, //
                {"tea" , "cola", "water"}
        };
        System.out.println(strArr.length);

        for (int i = 0; i < strArr.length; i++){  // 0
            for (int k = 0; k < strArr[i].length; k++){ //0,1,2,3,4,5,6,7,8,9
                System.out.println(strArr[i][k]);

            }
        }
        String [] foods = {"sushi", "ramen" , "tom-yam"};
        String [] drinks = {"green tea", "black tea" , "mountain dew", "water"};

        String [][] menu = new String[][]{foods , drinks};
        for (int i = 0; i < menu.length; i++){
            for (int k = 0 ; k < menu [i].length; k++){
                System.out.println(menu[i][k]);
            }
        }
        String [] birds = {"mockingbird", "sparrow", "parrat","eagle"};
        String [] insects = {"grasshopper ", "spider", "ladybug"};
        String [] mammals = {"cow", "bear", "whale","elephant","dog","human"};

        String [][] animals = new String[][]{birds,insects,mammals};

        for (int i =0; i<animals.length; i++){
            for (int k = 0; k < animals[i].length; k++){
                System.out.println(animals[i][k] +" ");
            }
            System.out.println();
        }
        System.out.println("===================================");
        String[][][] animals2= new  String[][][]{{birds},{insects},{mammals},{birds},{insects}};
        for (int i = 0; i<animals2[i].length; i++){
            for (int k = 0; k<animals2[i].length; k++){
                for ( int j = 0;  j < animals2[i][k].length; j++){
                    System.out.println(animals2[i][k][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
