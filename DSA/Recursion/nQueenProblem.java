public class nQueenProblem {

    public static void printSol(int[][] board, int n){
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static boolean isSafe(int[][] board, int row, int col, int n){
        int i,j;
        // check on the left row
        for(i = 0 ; i < col ; i++)
        {
            if(board[row][i] == 1){
                return false;
            }
        }

        // check for the upper diagonal in the left direction
        for(i = row, j = col ; i >= 0 && j >= 0 ; i--, j--)
        {
            if(board[i][j] == 1)
             {
                return false;
            }
        }

        // check for the lower diagonal in the left direction
        for(i = row, j = col ; i < n && j >= 0 ; i++, j--){
            if(board[i][j] == 1)
            {
                return false;
            }
        }

        return true;
    }

    // function to solve n queen problem
    public static boolean solveQueen(int[][] board, int col, int n)
    {
        // Base Case- if you have placed all the queens then return true
        if(col >= n)
        { 
            //means we have place queens in all the col 
            return true;
        }

        // consider this col and try to place all the queens in all the rows one by one
        for(int i = 0 ; i < n ; i++)
        {
            // check if it is safe to place queen or not
            if(isSafe(board, i, col, n) == true)
            {
                // place the queen on the board
                board[i][col] = 1;
                    
                // recursive call to place all the queens
                if(solveQueen(board, col + 1, n) == true){
                    return true;
                }
                // if placing queen doesn't to solution then backtrack
                board[i][col] = 0;
            }
        }   
        // if it is not possible to place all the queen in any rof of the given column then return false
        return false;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0},
                         {0,0,0,0},
                         {0,0,0,0},
                         {0,0,0,0}};
        if(solveQueen(board, 0, board.length) == true)
        {
            printSol(board, board.length);
        }
        else{
            System.out.println("Solution is not present!");
        }
    }
}
