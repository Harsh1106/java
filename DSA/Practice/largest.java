// Print largest element in the array.
public class largest {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; //means -infinity
        int smallest = Integer.MAX_VALUE; //means +infinity
        for(int i = 0 ; i < num.length ; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest number in array: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,6,4,8,9,0,17};
        int res = getLargest(num);
        System.out.println("Largest element in the array: "+res);
    }
}
