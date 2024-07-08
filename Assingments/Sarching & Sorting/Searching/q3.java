public class q3 {
    public static int count(int[] arr, int idx){
        int high = arr.length - 1, low = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == idx && (mid == 0 || arr[mid - 1] == 0)){
                return arr.length - mid;
            }else if(arr[mid] == 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,1,1};
        int idx = 1;
        int low = 0, high = arr.length - 1;
        int count = count(arr, idx);
        System.out.println(count);
    }
}
