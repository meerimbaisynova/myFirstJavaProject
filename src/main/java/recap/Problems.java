package recap;

public class Problems {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("mama"));
    }
      ///palindrome is a word , if you read this word from end to beginning it will be same word. mom==>moom
    // civic ==> civic,  pop==>pop
    public static boolean isPalindrome(String str){
        String reserved ="";

        for(int i = str.length()-1; i >=0; i--){
            reserved = reserved + str.charAt(i);
        }
        return reserved.equals(str);
    }

    // given two string : a and b,
    // if a contains b = return true ,if b
    // if b contains a = return false
    public static boolean ifContains(String a, String b){
        if (a.contains(b)){
            return  true;
        }else if (b.contains(a)){
            return false;
        }
        return false;
    }
    /*
    given two strings : x and y , count number of times
    x is found in y , return this integer
    x = hello , y = hihellogoodhello
    return 2
     */
    public static int countX(String x, String y){
        int count = 0;
        for( int i = 0; i < y.length()-x.length(); i++){
            if(y.substring(i,i + x.length()).equals(x)){
                count++;
            }
        }
        System.out.println(count);
        return count;

    }
    }

