    import java.util.*;

    public class q4 {
        public static void main(String[] args){
            // int a[] = {2, 1,3};
            // int b[] = {7,8,9};
            // int k = 10;

            int a[] = {1, 2, 2, 1};
            int b[] = { 3, 3, 3, 4 };
            int k = 5;
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < b.length / 2; i++) {
                int temp = b[i];
                b[i] = b[b.length - i - 1];
                b[b.length - i - 1] = temp;
            }
            for(int i = 0 ; i < a.length ; i++){
                if(a[i] + b[i] < k){
                    System.out.println("No");
                    break;
                }
                else{
                    System.out.println("Yes");
                    break;
                }
            }
        }
    }
