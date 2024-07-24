public class String_Demo{
    public static void main(String[] args){
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o'};
        String helloString  = new String (helloArray);
        // Immutable
        System.out.println(helloString);
    }
}
// javac String_Demo.java && java String_Demo