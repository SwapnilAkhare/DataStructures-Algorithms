package Practice;


import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        int original=n;
        while(n>0){
            int lastdigit=n%10;
            sum= sum+Math.pow(lastdigit,3);
            n=n/10;

        }
        if(sum==original){
        System.out.println("it is a armstrong no");}
        else{
            System.out.println("It is not armstrong no");
        }
    }
}
