// 14 Aug
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumsLoop {
    public static void main(String[] args) {
        for (Level i : Level.values()) {
            System.out.println(i);
        }
    }
}
