// 14 Aug
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class ENUMSwitch {
    public static void main(String[] args) {
        Level l1 = Level.MEDIUM;
        switch (l1) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;

            default:
                break;
        }
    }
}
