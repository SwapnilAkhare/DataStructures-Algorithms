package FunctionProgram;

import java.util.Scanner;

public class SumOfNaturalNumber {
    static int Sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=Sum(n);
        System.out.println(ans);

    }
}
