public class EnumsInClass {
    // 14 Aug
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level l1 = Level.MEDIUM;
        System.out.println(l1);
    }
}
