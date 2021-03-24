package String;
    import java.lang.StringBuilder;

     public class ReverseString
    {
        public static void main (String[] args)
        {
            String str = "Hello, World";
            String rev = new StringBuilder(str).reverse().toString();

            System.out.println("The reverse of the given string is " + rev);
        }
    }


