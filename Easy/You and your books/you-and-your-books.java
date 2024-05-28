//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();
            int k = sc.nextInt();
            int ar[] = new int[N];
            //	int count = 0;
            for (int i = 0; i < N; i++) ar[i] = sc.nextInt();

            System.out.println(new Solution().max_Books(ar, N, k));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    long max_Books(int arr[], int n, int k) {
        long res = 0;
        int s = 0, e=0;
        while(e<n){
            while(s<n && arr[s] > k) s++;
            e=s;
            long b = 0;
            while(e<n && arr[e]<=k){
                b += arr[e];
                e++;
            }
            s=e;
            res = Math.max(res, b);
        }
        return res;
    }
}