package FunctionProgram;
import java.util.Scanner;
public class PrintNoBetweenAandB {
  public static boolean isPrime(int num){

        for(int i=2;i<=num;i++) {
            if (num % i == 0) {
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

}
