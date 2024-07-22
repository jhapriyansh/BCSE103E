import java.util.Scanner;
public class Input_Example{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter UserName: ");
        String userName = scanner.nextLine();
        System.out.println("Hello "+userName);
        scanner.close();
    }
}
// javac Input_Example.java && java Input_Example