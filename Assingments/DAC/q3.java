import java.util.*;

public class q3 {
    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};

        segregateArrayInPlace(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void segregateArrayInPlace(int[] arr) {
        int n = arr.length;

        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                for (int j = i; j > pos; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[pos] = temp;
                pos++;
            }
        }
    }
}
