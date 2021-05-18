package FunctionProgram;
import java.lang.Math;
import java.util.Scanner;

public class PythagorianTripplet {
    static boolean Check(int n1,int n2,int n3){
        int x=Math.max(n1,Math.max(n2,n3));
       int y,z;
        if(x==n1){
            y=n2;
            z=n3;
        }
        else if(x==n2){
            y=n1;
            z=n3;
        }
        else{
            y=n1;
            z=n2;
        }
        if(x*x == y*y + z*z)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(Check(a,b,c)){
            System.out.println("it is a pythagorian tripplet");
        }
        else{
            System.out.println("it is not pythagorian triplet");
        }
    }
}
