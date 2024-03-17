// Print diagonal of a matrices 

package Array;

// public class PracticeQuestion5 {
    
// }
class Solution {
    public int[] PracticeQuestion5(int[][] mat) {
        
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