public class q2{
    public static void main(String[] args){
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        int neg = -1, pos = -1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0){
                neg = i;
                break;
            }
        }
        
        for(int i = arr.length - 1 ; i > 0 ; i--){
            if(arr[i] > 0){
                pos = i;
                break;
            }
        }

        while(neg < 0 && pos > 0){
            int temp = arr[pos];
            arr[pos] = arr[neg];
            arr[neg] = temp;
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}