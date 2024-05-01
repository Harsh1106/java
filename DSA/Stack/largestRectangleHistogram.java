import java.util.*;
public class largestRectangleHistogram {
    // through stack
    public static int getMaxArea(int[] arr, int n){
        // TC: O(n)
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int tp; //to store the top of the stack
        int areaWithTop; //to store with top bar as the smallest bar

        int i = 0;
        while(i < n){
            //if this bar is higher than the bar on top
            // stack, push it to stack
            if(s.empty() || arr[s.peek()] <= arr[i]){
                s.push(i++);
            }
            else{
                tp = s.peek(); //store the top index
                s.pop(); //pop the top

                // System.out.println("I: "+i);

                areaWithTop = arr[tp] * (s.empty() ? i : i - s.peek() - 1);

                // update max area, if needed
                if(maxArea < areaWithTop){
                    maxArea = areaWithTop;
                }
            }
            while(s.empty() == false){
                tp = s.peek();
                s.pop();
                areaWithTop = arr[tp] * (s.empty() ? i : i - s.peek() - 1);
                if(maxArea < areaWithTop){
                    maxArea = areaWithTop;
                }
            }
        }
        return maxArea;


    }



    public static int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
        int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
        lessFromRight[height.length - 1] = height.length;
        lessFromLeft[0] = -1;
    
        for (int i = 1; i < height.length; i++) {
            int p = i - 1;
    
            while (p >= 0 && height[p] >= height[i]) {
                p = lessFromLeft[p];
            }
            lessFromLeft[i] = p;
        }
    
        for (int i = height.length - 2; i >= 0; i--) {
            int p = i + 1;
    
            while (p < height.length && height[p] >= height[i]) {
                p = lessFromRight[p];
            }
            lessFromRight[i] = p;
        }
    
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
        }
    
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
        }
        // int max = largestRectangleArea(arr);
        int max = getMaxArea(arr, arr.length);
        System.out.println(max);
    }
}
