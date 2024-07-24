import java.util.Scanner;
public class Calculator_Practice{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1)Add\n2)Subtract\n3)Multiply\n4)Divide\n5)Find Remainder\n6)Exit");
            System.out.print("Select the operation: ");
            int resp = scanner.nextInt();
            switch(resp){
                case 1:{
                    double a, b;
                    System.out.print("Enter a: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter b: ");
                    b = scanner.nextFloat();
                    double sum = a+b;
                    System.out.println("Sum is: "+sum);
                }
                break;
                case 2:{
                    double a, b;
                    System.out.print("Enter a: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter b: ");
                    b = scanner.nextFloat();
                    double diff = a-b;
                    System.out.println("Difference is: "+diff);
                }
                break;
                case 3:{
                    double a, b;
                    System.out.print("Enter a: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter b: ");
                    b = scanner.nextFloat();
                    double prod = a*b;
                    System.out.println("Product is: "+prod);
                }
                break;
                case 4:{
                    double a, b;
                    System.out.print("Enter dividend: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter divisor: ");
                    b = scanner.nextFloat();
                    if(b == 0){
                        System.out.println("Can't divide by 0.");
                    }
                    else{
                        double quot = a/b;
                        System.out.println("Quotient is: "+quot);
                    }
                }
                break;
                case 5:{
                    double a, b;
                    System.out.print("Enter dividend: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter divisor: ");
                    b = scanner.nextFloat();
                    if(b == 0){
                        System.out.println("Can't divide by 0.");
                    }
                    else{
                        double rem = a%b;
                        System.out.println("Remainder is: "+rem);
                    }
                }
                break;
                case 6:
                scanner.close();
                    System.exit(0);
                    break;
                default: System.out.println("Invalid option.");
            }
        }
    }
}
// javac Calculator_Practice.java && java Calculator_Practice