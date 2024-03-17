//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] mat = new int[n][n];
            String[] S = br.readLine().trim().split(" ");
            int i = 0;
            int j = 0;
            for(int k = 0; k < S.length; k++){
                mat[i][j] = Integer.parseInt(S[k]);
                j++;
                if(j == n){
                    i++;
                    j = 0;
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.matrixDiagonally(mat);
            for(int it = 0; it < ans.length; it++){
                System.out.print(ans[it] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        
        int n=mat.length;
        int []ans=new int[n*n];
        int index=0;
        int check=0;
        for(int j=0;j<n;j++)
        {
            if(check%2!=0)
            {
                int row=0,col=j;
                while(row<n && col>=0)
                {
                    ans[index++]=mat[row][col];
                    row++;
                    col--;
                }
            }
            else
            {
                int row=j,col=0;
                while(row>=0 && col<n)
                {
                    ans[index++]=mat[row][col];
                    row--;
                    col++;
                }
            }
            check++;
        }
        
        for(int i=1;i<n;i++)
        {
            if(check%2==0)
            {
                int row=n-1,col=i;
                while(row>=0 && col<n)
                {
                    ans[index++]=mat[row][col];
                    row--;
                    col++;
                }
            }
            else
            {
                int row=i,col=n-1;
                while(row<n && col>=0)
                {
                    ans[index++]=mat[row][col];
                    row++;
                    col--;
                }
            }
            check++;
        }
        return ans;
    }
}