import java.util.Scanner;

// 31 July
public class Arrays_In_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is: " + arr[i]);
        }
        scanner.close();
    }
}
