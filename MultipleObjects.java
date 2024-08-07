// 7 Aug
public class MultipleObjects {
    int x = 5;

    public static void main(String[] args) {
        MultipleObjects ob1 = new MultipleObjects();
        MultipleObjects ob2 = new MultipleObjects();
        ob2.x = 4;
        System.out.println(ob1.x);
        System.out.println(ob2.x);
    }
}