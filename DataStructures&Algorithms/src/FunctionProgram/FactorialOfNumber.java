package FunctionProgram;
import java.util.Scanner;
public class FactorialOfNumber {
   static int factorial=1;
    static int fact(int num){
        for(int i=2;i<=num;i++){
        factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
