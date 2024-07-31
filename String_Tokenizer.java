
// 31 July
import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {
        // P1
        // StringTokenizer st = new StringTokenizer(
        // "Demonstrating methods from String Tokenizer Class \n This is a newline
        // character.", " ");
        // while (st.hasMoreTokens()) {
        // System.out.println(st.nextToken());
        // }

        // P2
        // StringTokenizer st = new StringTokenizer("my,name,is,khan");
        // System.out.println(st.nextToken(","));

        // P3
        // StringTokenizer st = new StringTokenizer("Demonstrating methods from String
        // Tokenizer Class.", " ");
        // while (st.hasMoreElements()) {
        // System.out.println(st.nextToken());
        // }

        // P4
        // StringTokenizer st = new StringTokenizer(
        // "Demonstrating methods from String Tokenizer Class", " ");
        // while (st.hasMoreElements()) {
        // System.out.println(st.nextElement());
        // }

        // P5
        // StringTokenizer st = new StringTokenizer(
        // "Sit adipisicing amet occaecat sunt nostrud quis officia amet elit commodo
        // quis minim enim pariatur.",
        // " ");
        // while (st.hasMoreTokens()) {
        // System.out.println(st.nextElement());
        // }

        // P6
        StringTokenizer st = new StringTokenizer(
                "Sit adipisicing amet occaecat sunt nostrud quis officia amet elit commodo quis minim enim pariatur.",
                " ");
        System.out.println(st.countTokens());
    }
}