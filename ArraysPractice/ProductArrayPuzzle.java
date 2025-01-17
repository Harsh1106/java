public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length, totalProd = 1, zero = 0;
        int[] res = new int[n];
        for(int i : arr){
            if(i == 0) zero++;
            else totalProd *= i;
        }
        if(zero > 1) return res;
        if(zero == 1){
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == 0) res[i] = totalProd;
            }
            return res;
        }
        for(int i = 0 ; i < arr.length ; i++){
            res[i] = totalProd / arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);
        for(int i : res) System.out.print(i + " ");
    }
}
