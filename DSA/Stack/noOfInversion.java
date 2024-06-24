import java.util.Arrays;

public class noOfInversion{
    public static int inversionCount(int[] arr, int n){
        int count = 0;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int mergeProcedure(int[] arr, int l, int mid, int h){
        int swap = 0;
        int[] lSubArray = Arrays.copyOfRange(arr, l, mid+1);
        int[] rSubArray = Arrays.copyOfRange(arr, mid + 1, h + 1);
        int i = 0, j = 0, k = l;
        while(i < lSubArray.length && j < rSubArray.length){
            if(lSubArray[i] <= rSubArray[j]){
                arr[k++] = lSubArray[i++];
            }
            else{
                arr[k++] = rSubArray[j++];
                // calculate the number of swaps
                swap += (mid + 1) - (l + i);
            }
        }
        // copy all the remaining elements from left subarray
        while(i < lSubArray.length){
            arr[k++] = lSubArray[i++];
        }

        // copy all the remaining elements from right subarray
        while(j < rSubArray.length){
            arr[k++] = rSubArray[j++];
        }
        return swap;
    }

    public static int invCount(int[] arr, int l, int h){
        int count = 0;
        if(l < h){
            int mid = l + (h - l)/2;
            count += invCount(arr, l, mid);
            count += invCount(arr, mid + 1, h);
            count += mergeProcedure(arr, l, mid, h);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}
        ;
        int n = arr.length;

        int count = inversionCount(arr, n);
        int countOpt = invCount(arr, 0, n-1);
        System.out.println("The number of inversion in array using brute force approach is: "+count);
        System.out.println("Now using optimmized approach is: "+countOpt);
    }
}