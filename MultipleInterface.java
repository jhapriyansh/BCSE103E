// 14 Aug
interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class Inheritor implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Inheritor o1 = new Inheritor();
        o1.myMethod();
        o1.myOtherMethod();
    }
}
