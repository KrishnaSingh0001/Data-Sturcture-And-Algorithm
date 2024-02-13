//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.smallestNumber(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String smallestNumber(int S, int D){
        
        String ans="";
        if(9*D<S) return "-1";
        
        
        int [] temp= new int [D];
        Arrays.fill(temp, 0);
        temp[D-1]=1;
        
        S=S-1;
        
        int i=0;
        while(i<D){
            
            if(S<9){
                temp[i]+=S;
                break;
            }
            else{
                temp[i]+=9;
                S-=9;
            }
            i++;
        }
        
        for(int j=D-1; j>=0; j--){
            ans+=String.valueOf(temp[j]);
        }
        
     return ans;   
    }
}