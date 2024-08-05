// 5 Aug
public class CloningArray {
    public static void main(String[] args) {
        int intArr[] = { 1, 2, 3 };
        int cloneArr[] = intArr.clone();
        // deep copy
        System.out.println(intArr == cloneArr);
        // will print false
        for (int i = 0; i < cloneArr.length; i++) {
            System.out.print(cloneArr[i] + " ");
        }
        System.out.println();
    }
}
