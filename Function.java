// 5 Aug
public class Function {
    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 13, 1, 2, 5, 4 };
        System.out.println(sum(arr));
    }
}