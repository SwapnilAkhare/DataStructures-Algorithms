package FunctionProgram;

import java.util.Scanner;

public class OctalToDecimal {

    static int OctToDec(int num){
        int ans=0;
        int x=1; //power of 8
        while(num>0){

            int lastdigit= num%10;

            ans += lastdigit * x;

            x *= 8;

            num=num/10;
        }
        return ans;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int result= OctToDec(n);
        System.out.println(result);
    }
}
