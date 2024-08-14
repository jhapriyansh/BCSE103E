// 14 Aug
class outerClass {
    int x = 5;

    static class innerClass {
        int y = 10;
        // can't access methods and attributes of outer class.
    }
}

public class statInnClass {
    public static void main(String[] args) {
        outerClass.innerClass inClass = new outerClass.innerClass();
        System.out.println(inClass.y);
    }
}
