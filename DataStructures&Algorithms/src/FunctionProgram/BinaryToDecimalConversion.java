package FunctionProgram;

import java.util.Scanner;

public class BinaryToDecimalConversion {

    static int BinaryToDecimal(int n){
        int ans=0; //to store the answer
        int x=1; // for power of  2 to multiply

        while(n>0){

            int lastdigit= n%10;

            ans += lastdigit * x;

            x *= 2;// update x and multiply factor 2 bcoz of binary

            n=n/10;  //update the n
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int result= BinaryToDecimal(n);
        System.out.println(result);

    }
}
