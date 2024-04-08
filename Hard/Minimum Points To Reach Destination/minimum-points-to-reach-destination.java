//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int points[][] = new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) points[i][j] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.minPoints(points, m, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{
    public int minPoints(int points[][], int M, int N) 
    { 
        int[][] dp = new int[M][N];

        // Initialize the bottom-right cell
        dp[M - 1][N - 1] = points[M - 1][N - 1] > 0 ? 1 : Math.abs(points[M - 1][N - 1]) + 1;

        // Fill the last column
        for (int i = M - 2; i >= 0; i--) {
            int needed = dp[i + 1][N - 1] - points[i][N - 1];
            dp[i][N - 1] = Math.max(1, needed);
        }

        // Fill the last row
        for (int j = N - 2; j >= 0; j--) {
            int needed = dp[M - 1][j + 1] - points[M - 1][j];
            dp[M - 1][j] = Math.max(1, needed);
        }

        // Fill the remaining cells
        for (int i = M - 2; i >= 0; i--) {
            for (int j = N - 2; j >= 0; j--) {
                int needed = Math.min(dp[i + 1][j], dp[i][j + 1]) - points[i][j];
                dp[i][j] = Math.max(1, needed);
            }
        }

        return dp[0][0];
    } 
}