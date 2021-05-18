package FunctionProgram;

import java.util.Scanner;

public class DecimalToOctal {
    static int DecToOct(int num) {

        int x = 1;
        int ans = 0;

        while (x <= num) {
            x *= 8;
        }
        x /= 8;

        while (x > 0) {

            int lastdigit = num / x;

            num -= lastdigit * x;

            x = x / 8;

            ans = ans * 10 + lastdigit;
        }
        return ans;
    }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();

            int result= DecToOct(n);
            System.out.println(result);

    }
}
