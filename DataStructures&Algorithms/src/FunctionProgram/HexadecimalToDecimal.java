package FunctionProgram;

import java.util.*;

// here we have to take string bcoz hexadecimal no are 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
public class HexadecimalToDecimal {
    static int HexToDec(String num) {

        int ans = 0;

        int x = 1;

        int s=num.length(); // size is measures from index value

        for(int i=s-1;i>=0;i--){

            if(num.charAt(i) >= '0' && num.charAt(i) <='9'){

                ans += x * (num.charAt(i)-'0');
            }
            else if(num.charAt(i) >= 'A' && num.charAt(i) <= 'F'){

                ans += x * (num.charAt(i) -'A' + 10);  // if num[i]=A then A-A=0 +10=10
                 }
            x *= 16;
        }
        return ans;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        int result = HexToDec(n);
        System.out.println(result);
    }
}
