/*
Two Sum II Input array is sorted.
This problem is similar to TwoSum.
To solve this problem, we can use two points to scan the array from both sides.
 */
package coding;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class TwoSumII {
    public static int[] TwoSumII(int numbers[], int target){
        if((numbers == null) || (numbers.length == 0)){
            return null;
        }
        
        int i =0, j = numbers.length -1;
        while (i<j){
            int x = numbers[i]+numbers[j];
            if(x < target) i++;
            else if (x>target) j--;
            else 
                return new int[] {i, j};
            
        }
        return null;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner (System. in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Number");
        int target = sc.nextInt();
        int result[] = TwoSumII(numbers, target);
        System.out.println("First Index = "+result[0]);
        System.out.println("Second Index = "+ result[1]);
    }
}
