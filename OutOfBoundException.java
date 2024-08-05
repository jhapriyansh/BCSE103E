// 5 Aug
public class OutOfBoundException {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        System.out.println("Trying to print an element outside the size of an array");
        System.out.println(arr[5]);
        // throws a outofbound exception
    }
}
