// 5 Aug
public class ReturningArrayFromFunction {
    public static int[] m1() {
        return new int[] { 1, 2, 3 };
    }

    public static void main(String[] args) {
        int arr[] = m1();
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}