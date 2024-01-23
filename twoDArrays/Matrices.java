// Creating an 2D arrays 
package twoDArrays;
import java.util.*;
public class Matrices {
    public static void main(String args []){
        int matrix[][] = new int [3][3];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i<n ; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        //output
        for(int i =0 ; i<n ; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



 // public static boolean Search(int matri[][], int key){
//     int matrix[][] = new int [3][3];
//     int n = matrix.length , m = matrix[0].length;
//     // Scanner sc = new Scanner(System.in);
//     for(int i =0 ; i<n ; i++){
//         for(int j = 0; j<m; j++){
//             if(matrix[i][j] == key){
//                 System.out.println("found at cell(" + i + " "+ j + ")");
//                 return true;
//             }

//         }
//         }
    
//     System.out.println("key not found ");
//     return false;
//     }