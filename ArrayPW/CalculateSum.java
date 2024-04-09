package ArrayPW;

public class CalculateSum {

    public static void main(String args[]) {
        int sum = 0;
        int[] num = {10, 20, 30, 40, 50, 60, 70};
        for (int i = 0 ; i <6; i++){
            sum += num[i];
            // System.out.println("Sum of array element is : " + sum);
        }

        System.out.println("Sum of array element is : " + sum);
        

    }
}
