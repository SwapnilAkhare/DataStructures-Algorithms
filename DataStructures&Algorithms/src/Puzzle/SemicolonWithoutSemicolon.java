
// print semicolon without using semicolon ?
// the idea here is to use Ascii value of semicolon which is 59
//The main logic here is as printf() returns PrintStream object which is not null
// so on comparison it with null (literal in Java) we will get our desired output.
package Puzzle;

public class SemicolonWithoutSemicolon {
    public static void main(String[] args) {

        // if(printf("%c",59)){} || if (putchar(59)){}......in C language

        // here we use printf becoz it return printstream.... and println return void
        // we can also use... append()..in place of printf()
        if(System.out.printf("%c", 59)==null) {

            //empty body to avoid use of semicolon
        }

        // while (!printf(59))...in c lang
        // using while
        while(System.out.printf("%c", 59) == null){

        }
    }
}
