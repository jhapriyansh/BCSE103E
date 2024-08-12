// 12 Aug
public class TestConstructor {
    int x;

    public TestConstructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        TestConstructor o1 = new TestConstructor(4);
        System.out.println(o1.x);
    }
}