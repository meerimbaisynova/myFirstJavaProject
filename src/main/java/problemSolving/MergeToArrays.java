package problemSolving;

public class MergeToArrays {
    public static void main(String[] args) {
        /*
        merge values from two giwen arrays and return them as one array
        1,2,3,4
        5,6,7,8,9,10
         */


    }
    public static int [] mergeToInArrays (int [] a, int [] b){
        int [] c = new  int[a.length + b.length];
        for (int i = 0; i < a.length; i ++){
            c[i] = a[i];
        }
        for (int j = a.length; j < c.length; j++){
            c [j] = b[j];
        }
        return c;
    }

}
