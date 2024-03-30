public class TilingProblem {
    public static int getWays(int n){
        if(n <= 3){ //base case
            return n;
        }
        // recursive case
        return getWays(n-1)+getWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println("For n = 11 total no of ways are "+getWays(11));
    }
}
