//{ Driver Code Starts
//Initial Template for Java

// import java.io.*;
// import java.util.*;

// class GFG {
//     public static void main(String args[]) throws IOException {
//         BufferedReader read =
//             new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(read.readLine());
//         while (t-- > 0) {
//             String S = read.readLine();
            
//             Solution ob = new Solution();
//             System.out.println(ob.isPalindrome(S));
//         }
//     }
// }
// } Driver Code Ends


//User function Template for Java

// class Solution 
// {
//     void isPalindrome(String s1) 
//     {
//         // Scanner sc = new Scanner(System.in);
//         // String s = sc.next();
//         String s2 = " ";
//         for(int i = s1.length()-1 ; i >= 0 ; i--)
//         {
//             s2 = s2 + s1.charAt(i);
//         }
//         if(s1.equals(s2))
//         {
//             System.out.println("S is pallindrome");
//         }
//         else
//         {
//             System.out.println("S is not a pallindrome");
//         }
//     }
// }
public class Pallindrome 
{
    public static void main(String[] args) 
    {
        // Solution s = new Solution();
        // s.isPalindrome("madam");
        String s1 = "madam";
        String s2 = "";
        for(int i = s1.length()-1 ; i >= 0 ; i--)
        {
            s2 = s2 + s1.charAt(i);
        }
        if(s1.equals(s2))
        {
            System.out.println("S is pallindrome");
        }
        else
        {
            System.out.println("S is not a pallindrome");
        }
    }
}
