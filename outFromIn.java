// 14 Aug
class outerClass {
    int x = 5;

    class innerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class outFromIn {
    public static void main(String[] args) {
        outerClass outClass = new outerClass();
        outerClass.innerClass inClass = outClass.new innerClass();
        System.out.println(inClass.myInnerMethod());
    }
}
