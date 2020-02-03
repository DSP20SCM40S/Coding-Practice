/*
 Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 */
package coding.Leetcode;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class SearchInsertPosition {
    static int searchposition(int[] arr, int num){
        int n = arr.length;
        int flag = 0;
        int i=1;
        int x=arr[0];
        while (x<=num){
            if(x==num){
                return i;
            }
            x=arr[i++];
        }
        int position = -1;
        while(x<num){
            position = i;
            x=arr[i++];
        }
        return position;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int result = searchposition(arr, num);
        System.out.println("The position is "+result);
    }
}
