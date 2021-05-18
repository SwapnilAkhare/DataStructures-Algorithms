package FunctionProgram;
import java.util.Scanner;
public class AddTwoNum {

  public static int add(int num1,int num2){
      int sum=num1+num2;
      return sum;
  }


    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();


          System.out.println(add(a,b));


    }
}
