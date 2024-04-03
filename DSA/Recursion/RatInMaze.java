import java.util.Arrays;

public class RatInMaze 
{
    public static boolean isSafe(int[][] maze, int x, int y, int n)
    {
        if(x <= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean solveMaze(int[][] maze, int[][] sol, int x, int y, int n)
    {
        // base case
        if(x == (n-1) && y == (n-1) && maze[x][y] == 1)
        {
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(maze, x, y, n))
        {
            // do
            sol[x][y] = 1;

            // recursive
            if(solveMaze(maze, sol, x + 1, y, n))
            {
                return true;
            }
            if(solveMaze(maze, sol, x, y + 1, n))
            {
                return true;
            }
            if(solveMaze(maze, sol, x - 1, y, n))
            {
                return true;
            }
            if(solveMaze(maze, sol, x, y - 1, n))
            {
                return true;
            }

             // backtrack
             sol[x][y] = 0;
             return false;
        }  
        return false;
    }    
    public static void main(String[] args) 
    {
        int[][] maze = {{1,0,1,0},
                        {1,0,1,1},
                        {1,1,0,1},
                        {0,1,1,1}}; 
        int[][] sol = {{0, 0, 0, 0},
                       {0, 0, 0, 0},
                       {0, 0, 0, 0},
                       {0, 0, 0, 0}};

        int len = maze.length;
        if(solveMaze(maze, sol, 0, 0, len)){
            System.out.println(Arrays.deepToString(sol)); //deepToString is used to print 2d arrays elements
        }
        else{
            System.out.println("Solution doesn't exist!");
        }
    }
}
