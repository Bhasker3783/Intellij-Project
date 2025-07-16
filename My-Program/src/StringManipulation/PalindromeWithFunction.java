package StringManipulation;

public class PalindromeWithFunction {
    public static void main(String[] args) {
        String name = "MADAM";
        String Reverse = new StringBuilder(name).reverse().toString();
        if(name.equals(Reverse)) {
            System.out.println("The string is a palindrome");
        }
        else  {
            System.out.println("The string is not a palindrome");
        }
    }
}
