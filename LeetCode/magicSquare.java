public class magicSquare{
    public static int findRowSum(int[][] arr, int r, int c){
        boolean[] vis = new boolean[10];
        int sum = 0;
        for(int i = 0 ; i < 3 ; i++){
            int rSum = 0;
            for(int j = 0 ; j < 3 ; j++){
                int val = arr[r+i][c+j];
                if(val ==  0 || val >= 10 || vis[val])
                    return -1;
                vis[val] = true;
                rSum += val;
            }
            if(i == 0)
                sum = rSum;
            else{
                if(sum != rSum)
                    return -1;
            }
        }
        return sum;
    }
    public static int findColSum(int[][] arr, int r, int c){
        int sum = 0;
        for(int j = 0 ; j < 3 ; j++){
            int colSum = 0;
            for(int i = 0 ; i < 3 ; i++){
                int val = arr[r+i][c+j];
                colSum += val;
            }
            if(j == 0){
                sum = colSum;
            }
            else{
                if(sum != colSum)
                    return -1;
            }
        }
        return sum;
    }
    public static int findDiagSum(int[][] arr, int r, int c){
        int diag1 = arr[r][c] + arr[r+1][c+1] + arr[r+2][c+2];
        int diag2 = arr[r][c+2] + arr[r+1][c+1] + arr[r+2][c];
        if(diag1 == diag2){
            return diag1;
        }
        else{
            return -1;
        }
    }
    public static boolean isMagicSquare(int[][] arr, int i, int j){
        int rowSum = findRowSum(arr, i, j);
        if(rowSum == -1) return false;
        int colSum = findColSum(arr, i, j);
        if(colSum == -1) return false;
        int diagSum = findDiagSum(arr, i, j);
        if(diagSum == -1) return false;
        if(rowSum == colSum && colSum == diagSum){
            return true;
        }
        return false;
    }
    public static int numMagicSquare(int[][] arr){
        int count = 0;
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0 ; i < row - 2 ; i++){
            for(int j = 0 ; j < col - 2 ; j++){
                if(isMagicSquare(arr, i, j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr = {{4,3,8,4},
                       {9,5,1,9},
                        {2,7,6,2}};
        int count = numMagicSquare(arr);
        System.out.println(count);
    }
}