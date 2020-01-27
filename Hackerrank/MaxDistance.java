/*
 Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].
If there is no solution possible, return -1.
Example :
A : [3 5 4 2]
Output : 2 
for the pair (3, 4)
 */
package interviewquestions;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class MaxDistance {

    public void calc_dist(int[] arr,int n, HashMap map ){
        int dist;
        for(int i=0; i<n; i++){
            dist=-1;
            for(int j=i+1; j<n; j++){
                if(arr[j]> arr[i] && dist < j-i){
                    dist =j-i;
                    map.put(arr[i], dist);
                }
            }
        }        
    }
    
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();            
        }
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
    }
}

/*

*/
