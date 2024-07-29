// 29 July
public class String_Buffer {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Hello ");
        // sb.append("Java"); // Output: Hello Java
        // sb.insert(1, "Java"); // Output: HJavaello
        // sb.replace(1, 3, "Java"); // Output: HJavalo
        // sb.delete(1, 3); // Output: Hlo
        // sb.reverse(); // Output: olleH
        // System.out.println(sb);

        StringBuffer sb = new StringBuffer();
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