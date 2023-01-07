package multidimensionalArrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        2D arrays are arrays of arrays
         */
        int []    oneDimArr1 = new int[5];
        int [] [] twoDimArr1 = new int[5][3];

        int [] oneDimArr2 = new int[]{1,2,3};
        int [] [] twoDimArr2 = new int [][] { {1,2,3,4,5}, {1,2,3}  };

        int [] oneDimArr3 = new int[3];
        oneDimArr3 [0] =1;
        oneDimArr3 [1] =3;
        oneDimArr3 [2] =5;

        int[][] twoDimArr3 = new int[2][3];
        twoDimArr3 [0][0] = 2;
        twoDimArr3 [0][1] = 5;

        twoDimArr3 [1][0] = 2;
        twoDimArr3 [1][1] = 6;
        twoDimArr3 [1][2] = 32443;  // we can put any number

        /*
        2d String Array
         */
        String [] strOneDim = new String[3];
        strOneDim[0] = "hello";
        strOneDim[1] = "you understad?";
        strOneDim[2] = "easy";

        String [] strOneDim2 = new String[]{"city", "state", "zip code"};

        String [] [] strTwoDim1 = new String[][]{{"abc", "def", "xyz"}, {"qwe", "rty"}};

        String [] [] strTwoDim2 = new String[3][4];
        strTwoDim2 [0][0] ="hello";
        strTwoDim2 [0][1] ="bye";
        strTwoDim2 [0][2] ="welcome";

        strTwoDim2 [1][0] ="go";
        strTwoDim2 [1][1] ="walk";
        strTwoDim2 [1][2] ="run";
        strTwoDim2 [1][3] ="sleep";

        boolean boolArr [][] = {{true, true, true} , {false}};

        short [][]shortArr = new short[5][2];
        System.out.println(shortArr.length);  //5

        float [][] floatArr = new float[10][80];
        floatArr [0][0] = 20.5f;
        floatArr [0][1] = 24.5f;
        floatArr [0][2] = 250.5f;
        floatArr [0][3] = 320.5f;
        floatArr [0][4] = 620.5f;
        floatArr [0][5] = 720.5f;
        floatArr [0][6] = 260.5f;
        floatArr [0][7] = 2420.5f;

        floatArr[1][0] = 2.8f;




    }
}
