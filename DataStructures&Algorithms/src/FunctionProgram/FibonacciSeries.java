package FunctionProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void Fibonacci(int num){
        int t1=0;
        int t2=1;
        int nextterm;
        for(int i=1;i<=num;i++){
            System.out.println(t1);
            nextterm=t1+t2;
            t1=t2;
            t2=nextterm;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n  =sc.nextInt();
        Fibonacci(n);
    }
}
