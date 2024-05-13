//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int rows;
            rows = Integer.parseInt(br.readLine());

            int columns;
            columns = Integer.parseInt(br.readLine());

            int[][] heights = IntMatrix.input(br, rows, columns);

            Solution obj = new Solution();
            int res = obj.MinimumEffort(rows, columns, heights);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int MinimumEffort(int rows, int columns, int[][] heights) {
        
        int dist[][] = new int[rows][columns];
        
        for (int arr[] : dist) Arrays.fill (arr , (int)(1e9));
        
        // As , we can reach to the source node with a distance of 0.
        dist[0][0] = 0;
        
        PriorityQueue<Tuple> pq = new PriorityQueue<>(new Comparator<Tuple>() {
            
            @Override
            public int compare (Tuple t1 , Tuple t2) {
                
                return t1.diff - t2.diff;
            }
            
        });
        
        // {diff , {row , col}}
        pq.add (new Tuple (0 , 0 , 0));
        
        while (!pq.isEmpty ()) {
            
            // 1. Remove
            Tuple tp = pq.poll ();
            
            int diff = tp.diff;
            int r = tp.r;
            int c = tp.c;
            
            // 2. Checkout whether we had reached to destination cell or not.
            
            // We had reached to the destination and PriorityQueue yielded the destination 
            // which means out of all cell's , destination cell has the minimum difference.
            // So, in the future destination's cell will get the diff equal to the current diff or greater diff
            // i.e. return the diff.
            if (r == rows-1 && c == columns-1) return diff;
            
            
            // 3. Getting all the neighbours from 4 directions.
            int rowDirect[] = {-1 , 0 , 1 , 0};
            int colDirect[] = {0 , 1 , 0 , -1};
            for (int i = 0 ; i < 4 ; i++) {
                
                int nrow = r + rowDirect[i];
                int ncol = c + colDirect[i];
                
                if ((nrow >= 0 && nrow < rows) && (ncol >= 0 && ncol < columns)) {
                    
                    int nDiff = Math.abs (heights[nrow][ncol] - heights[r][c]);
                    
                    // Effort : Max of all the diff in a path.
                    int effort = Math.max (nDiff , diff);
                    
                    if (effort < dist[nrow][ncol]) {
                        
                        pq.add (new Tuple (effort , nrow , ncol)); // Only the max effort can be use.
                        dist[nrow][ncol] = effort;
                    }
                
                }
                
                
            }
        }
        
        return 0;
        
    }
    
}

class Tuple {
        
    int diff;
    int r;
    int c;
    
    public Tuple (int diff , int r , int c) {
        
        this.diff = diff;
        this.r = r;
        this.c = c;
    }
}