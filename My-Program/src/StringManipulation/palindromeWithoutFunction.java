package StringManipulation;

public class palindromeWithoutFunction {

    public static void main(String[] args) {
        String name = "MADAM";
        String Reverse = "";

        for(int i =name.length()-1;i>=0;i--){
            Reverse = Reverse+name.charAt(i);
        }
        if(name.equals(Reverse)){
            System.out.println("The string is a palindrome");
        }
        else {
            System.out.println("The string is not a palindrome");
        }
    }
}
