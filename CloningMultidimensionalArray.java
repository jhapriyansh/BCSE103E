// 5 Aug
public class CloningMultidimensionalArray {
    public static void main(String[] args) {
        int intArr[][] = { { 1, 2, 3 }, { 4, 5 } };
        int cloneArr[][] = intArr.clone();
        System.out.println(intArr == cloneArr);
        System.out.println(intArr[0] == cloneArr[0]);
    }
}
