import java.util.Scanner;

public class assignment_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == a - 1) {
                for (int j = 0; j < a; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int j = 0; j < a - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
