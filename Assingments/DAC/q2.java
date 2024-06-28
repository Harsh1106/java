public class q2{
    public static void seperateArray(int[] arr){
        int n = arr.length;
        int temp[] = new int[n];

        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < 0){
                temp[j++] = arr[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i] >= 0){
                temp[j++] = arr[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args){
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};

        seperateArray(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}