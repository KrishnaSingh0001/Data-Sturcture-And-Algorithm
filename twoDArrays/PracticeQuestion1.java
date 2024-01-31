// Question 1. Print the number of 7's that are in 2d arrays input arrays
// int array [][]= {{4 , 7 , 8 },{8 , 8 , 7 }};

package twoDArrays;
public class PracticeQuestion1 {
    
    public static void main(String args[]){
        int array [][]= {{4 , 7 , 8 },{8 , 8 , 7 }};
        int countof7 = 0;
        for(int i = 0; i<array.length;i++){
            for (int j = 0; j<array[0].length;j++){
                if(array[i][j] == 7){
                    countof7++;
                }
            }
        }
        System.out.println("Count of 7 is " + countof7);
    }
}
