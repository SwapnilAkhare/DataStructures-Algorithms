package FunctionProgram;

import java.util.Scanner;

public class DecimalToBinary {
    static int DecToBinary(int num) {

        int x = 1; //base 2pow0;
        int ans = 0; // to store the binary number

        while (x <= num) {

            x *= 2;    // i.e loop till maximum power of 2 is not come
        }
        x = x / 2; //as at last x value bcom greater than num then we have to divide it by 2 to get the previous value

        while (x > 0) {

            int lastdigit = num / x;  // store the quotient as last value  ex. 12/8=1

            num = num - lastdigit * x;  // update the num

            x = x / 2; // decrease the power of two i.e 8 to 4

            ans = ans * 10 + lastdigit;
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int result= DecToBinary(n);
        System.out.println(result);
    }

    }