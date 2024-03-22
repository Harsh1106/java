public class alternateReverse {
    public static void reverse(int arr[]){
        int first = 0 , last = arr.length-1;
        while(first < last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first = first + 2;
            last = last - 2;
        }
    }   
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        reverse(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
