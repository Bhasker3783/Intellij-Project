package StringManipulation;

public class StringReverseWithoutFunction {
    public static void main(String[] args) {

        String name = "Bhasker";
        String Reverse = "";

        for(int i = name.length()-1;i>=0;i--)
        {
            Reverse = Reverse + name.charAt(i);

        }
        System.out.println("After Reverse: "+Reverse);
    }
}
