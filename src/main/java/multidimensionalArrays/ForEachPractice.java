package multidimensionalArrays;

public class ForEachPractice {
    public static void main(String[] args) {

        String [] planets = {"Earth" , "Mars", "Jupiter","Venera","Uranus"};
        String [] condinents = {"North America" , "South America", "Asia","Europe","Africa"};
        String [] countries = {"Switzerland" , "Namibia", "Germany","","Japan"};
        String [] cities = {"Berlyn " , "Zurich", "Berlyn"," Tokyo","Luanda"};

        long [] population = {2500000, 50000000, 8800000,13000000,400000000};
        long [] numbers  = {1111111, 22222, 333333,444444,555555,6666666};

        // create 2 dimen array of lons using for each loop , print evething

        int [] num1 = {1,2,3,4,5};
        int [] num2 = {10,20,30,40,50};
        int [] num3 = {100,200,300,400,500};
        int [] num4 = {1000,2000,3000,4000,5000};
        int [] num5 = {10000,20000,30000,40000,50000};
        // create 5 dimen array of int , using for each loop , print everything

        int[][][][][] fiveDimInArr = {{{{num1, num2},{num3, num4}}}};
        for (int [][][][] fourDimIntArr:fiveDimInArr ){
            for (int [][][] threeDimIntArr:fourDimIntArr){
                for (int[][] twoDimIntArr:threeDimIntArr){
                    for (int [] oneDimIntArr:twoDimIntArr){
                        for (int a:oneDimIntArr){
                            System.out.println(a+"");
                        }

                    }
                }

            }
        }
        
    }
}
