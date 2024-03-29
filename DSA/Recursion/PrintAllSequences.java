import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllSequences {
    public static void printSequence(int[] arr, int index, ArrayList<Integer> tempArr){
        // base condition
        if(index == arr.length){
            if(tempArr.size() > 0){ //print the subsequence - but do not print empty entries
                System.out.println(tempArr);
            }
            return;
        }
        // recursive call

        // include case
        printSequence(arr, index + 1, tempArr);

        //add the value in tempArr
        tempArr.add((arr[index]));

        // do not include
        printSequence(arr, index + 1, tempArr);

        // remove the last value
        tempArr.remove(tempArr.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.print("For the array - "+ Arrays.toString(arr));
        printSequence(arr, 0, new ArrayList<>());
    }
}
