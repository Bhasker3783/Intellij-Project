package StringManipulation;

public class StringReverseWithFunction {

    public static void main(String[] args) {
        String name = "Bhasker";
        String Reverse = new StringBuilder(name).reverse().toString();
        System.out.println(" After Reverse: "+Reverse);
    }
}
