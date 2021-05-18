package FunctionProgram;

import java.util.Scanner;

public class PascalTriangle {
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
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= i; j++) {
                int ans = fact(i) / (fact(i - j) * fact(j));
                System.out.print(ans);
            }

            System.out.println("");
        }
    }
}
