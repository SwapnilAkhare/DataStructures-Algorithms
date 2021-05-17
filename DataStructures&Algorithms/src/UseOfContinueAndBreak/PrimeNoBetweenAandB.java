package UseOfContinueAndBreak;
import java.util.Scanner;

//find prime no between a and b
public class PrimeNoBetweenAandB {
    public static void main(String[] args) {
        int i, num;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (num = a; num <= b; num++) {

            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println("is not prime" +num);
                    break;
                }
            }

            if (num==i) {
                System.out.println("is prime"  +i);
            }
        }
    }
}
