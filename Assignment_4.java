// 29 July
public class Assignment_4 {
    public static void main(String[] args) {
        int[] arr = { 1, 34, 56, 2, 14, 67, 8 };
        // int max = 0;
        // for (int i = 0; i < 3; i++) {
        // max = arr[0];
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] > max) {
        // max = arr[j];
        // }
        // }
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] == max) {
        // arr[j] = 0;
        // }
        // }
        // }
        // System.out.println(max);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 3]);
    }
}