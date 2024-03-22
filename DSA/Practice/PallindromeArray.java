public class PallindromeArray {
    public static void findArray(int[] arr){
        int flag = 0;
        for(int i = 0 ; i < arr.length/2 ; i++){
            if(arr[i] != arr[arr.length - i - 1]){
                flag = 1;
                System.out.println("Not a pallindrome!");
                break;
            }
        }
        if(flag == 0){
            System.out.println("Pallindrome Array!");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        findArray(arr);
    }
}


// Here TC = O(n)
// SC = O(1)