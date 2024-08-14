// 14 Aug
// tjohi -1
// zrlh +1
class outerClass {
    int x = 5;

    class innerClass {
        int y = 10;
    }
}

public class Inner_Classes {
    public static void main(String[] args) {
        outerClass outClass = new outerClass();
        outerClass.innerClass inClass = outClass.new innerClass();
        System.out.println(inClass.y + outClass.x);
    }
}
