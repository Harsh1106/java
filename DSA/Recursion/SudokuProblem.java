public class SudokuProblem {
    public static void print(int[][] grid, int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static boolean isSafe(int[][] grid, int row, int col, int num, int n)
    { 
        // row clash - row has unique values
        for(int i = 0 ; i < n ; i++)
        {
            // check if it is safe to assign the no or not
            if(grid[row][i] == num)
            {
                return false;
            }
        }

        // col clash - column has unique value
        for(int i = 0 ; i < n ; i++)
        {
            // check if it is safe to assign the no or not
            if(grid[i][col] == num)
            {
                return false;
            }
        }

        // subgrid/box - subgrid has unique value
        int sqrt = (int)Math.sqrt(n);
        int boxRow = row - row % sqrt;
        int boxCol = col - col % sqrt;

        for(int i = boxRow ; i < boxRow + sqrt ; i++)
        {
            for(int j = boxCol ; j < boxCol + sqrt ; j++)
            {
                if(grid[i][j] == num){
                    return false;
                }
            }
        }

        // if there is no clash, it is safe to assign num
        return true;
    }

    public static boolean solver(int[][] grid, int n)
    {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(grid[i][j] == 0)
                {
                    row = i;
                    col = j;

                    // we still have some value left in sudoku box
                    isEmpty = false;

                    break;
                }
            }
            if(!isEmpty)
            {
                break;
            }
        }

        // no empty space left
        if(isEmpty)
        {
            return true;
        }

        // else for each row do backtrack
        for(int num = 1 ; num <= 9 ; num++)
        {
            if(isSafe(grid, row, col, num, n) == true)
            {
                grid[row][col] = num;
                if(solver(grid, n))
                {
                    return true;
                }
                else
                {
                    // backtrack
                    grid[row][col] = 0;
                }
            }            
        }
        return false;
    }

    public static void main(String[] args) 
    {
        int[][] grid = {{3,0,6,5,0,8,4,0,0},
                        {5,2,0,0,0,0,0,0,0},
                        {0,8,7,0,0,0,0,3,1},
                        {0,0,3,0,1,0,0,8,0},
                        {9,0,0,8,6,3,0,0,5},
                        {0,5,0,0,9,0,6,0,0},
                        {1,3,0,0,0,0,2,5,0},
                        {0,0,0,0,0,0,0,7,4},
                        {0,0,5,2,0,6,3,0,0}};
        if(solver(grid, grid.length))
        {
            print(grid, grid.length);
        }
        else
        {
            System.out.println("No solution exists");
        }
    }
}
