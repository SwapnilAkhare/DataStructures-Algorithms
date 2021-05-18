package FunctionProgram;

import java.util.Scanner;

public class CalculateNcRcombinaton {
    static int fact(int num){
        int factorial=1;
        for(int i=2;i<=num;i++){
            factorial=factorial*i;

        }
        return factorial;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ans=fact(n)/(fact(n-r)*fact(r));
        System.out.println(ans);

    }
}
