// 29 July
public class String_Builder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Hello ");
        // sb.append("Java");
        // sb.insert(1, "Java"); // Output: HJavaello
        // sb.replace(1, 3, "Java"); // Output: HJavalo
        // sb.delete(1, 3); // Output: Hlo
        // sb.reverse(); // Output: olleH
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());
        /*
         * Output
         * 16
         * 16
         * 34
         */
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        /*
         * Output
         * 34
         * 70
         */
    }
}
