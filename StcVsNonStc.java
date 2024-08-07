// 7 Aug
public class StcVsNonStc {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects.");
    }

    public void myMethod() {
        System.out.println("Public methods must be called by creating objects.");
    }

    public static void main(String[] args) {
        myStaticMethod();
        StcVsNonStc o1 = new StcVsNonStc();
        o1.myMethod();
    }
}
