import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};
        int first = -1, second = -1;

        // for (int i = 1; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         first = i;
        //         break;
        //     }
        // }

        // for (int i = arr.length - 1; i > 0; i--) {
        //     if (arr[i] < arr[i - 1]) {
        //         second = i;
        //         break;
        //     }
        // }

        // if (first != -1 && second != -1) {
        //     int temp = arr[first];
        //     arr[first] = arr[second];
        //     arr[second] = temp;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // Second way
        Arrays.sort(arr, 1, 7);
        System.out.println(Arrays.toString(arr));
    }
}
