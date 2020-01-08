/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterviewquestions;
import java.util.*;
import java.io.*;

/**
 *
 * @author 12245
 */
public class TwoSum {
    
    public static int[] twoSum (int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        int[] result = new int[2];
        
        for(int i = 0; i<numbers.length; i++){
            if(map.containsKey(numbers[i])){
                int index = map.get(numbers[i]);
                result[0]= index;
                
                result[1]= i;
                break;
            }
            else{
                map.put(target - numbers[i], i);
            }
        }
        return result;
    }
    
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i =0;i<size;i++) {
            numbers[i]= sc.nextInt();
        }            
        System.out.println("Enter the Target Number");
        int target = sc.nextInt();
        int[] result = twoSum(numbers, target);
        System.out.println("First Index : "+ result[0]);
        System.out.println("Second Index : "+ result[1]);
        
             
    }
}
