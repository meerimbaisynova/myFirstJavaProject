package loops;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 0;
        while (x<=10){
            System.out.println("Good morning");
            x++;
        }
        int i = 0;
        while (i<=20){
            System.out.println(i);
            i++;
    }
        int y = 1;
        while (y<=31){
            System.out.println(y+"January 2023");
            y++;
        }

        /*
        print numbers from 1 to 30
        if number is even odd add 2
        1- odd + 2 =3
        2 - even +3 =5
        3- 0dd + 2 = 5
        4 - even + 3 = 5
        hint: number % 2==0 - even
        if,else
         */
        int a= 1;
        while (a<30){
            if(a%2==0){
            System.out.println(a+" - even" +3+ "=" + (a+3));
        }else {
                System.out.println(a+ " odd +2 = " +(a+2));
            }
            a++;
}
        /*
        print numbers from 100 to 1
        if number can be devided by 4, print number: quarter
        if number can be devided by 2, print number double

        100 double
        100 quarter
        99
        98 double
        97
        96 double
        95
        use for loop , if else, modulus
         */
        for(int c = 100; c>0; c--){

            if(c%4 == 0) {
            System.out.println(c +"quarter");
        }

        else if (c%2 ==0){
                System.out.println(c +"double");
            }

        else {
                System.out.println(c);
            }
}

}
}

