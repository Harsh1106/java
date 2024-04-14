// TC: O(N)
// SC: O(N)
import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element in an array: ");
        int target = sc.nextInt();

        // Create a hashmap where key is arr[i] and value is i
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(arr[i], i);
        } 
        boolean flag = true;
        int[] result = new int[2];
        // if current is equal to the target 
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == target && map.containsKey(0)){
                result[0] = i;
                result[1] = map.get(0);
                break;
            }
            else if(map.containsKey(target - arr[i])){
                if(map.get(target - arr[i]) > i){
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
            }
            else{
                result[0] = -1;
                result[1] = -1;
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("Two sum index are: ["+result[0]+","+result[1]+"]");
        }
        else{
            System.out.println("Two sum index are: ["+result[0]+","+result[1]+"]");
        }
    }
}
