package Practice;

import java.util.Scanner;

public class PrimeNOUsingFlag {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int flag=0; //set flag to 0
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not prime"+n);
                flag=1;// if no is not prime then flag set to 1
                break;
            }
        }
        if(flag==0){
            System.out.println("prime no"+n);

        }
    }
}
