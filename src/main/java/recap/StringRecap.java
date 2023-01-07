package recap;

public class StringRecap {
    public static void main(String[] args) {
        doubleChar("Coding");  // CCoding

        String name="Johny";
        String lastname ="Depp";
        name = name +lastname;
        System.out.println(name);
    }
    public static  String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
                result += str.charAt(i) + "";
                result += str.charAt(i) + "";
            }
            return result;
        }
        public static String reverseString(String str) {
        String result ="";
        for(int i = str.length() -1; i >=0; i--){
            result= result +str.charAt(i);
        }
            System.out.println(result);
        return result;

        }

        public static void countA(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'i'){
                counter++;
            }
        }
            System.out.println(str + "=" + counter);
        }
    }

