/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterviewquestions;
import java.io.*;
import java.util.*;      
/**
 *
 * @author Disha Sharma
 */
public class SockMerchant {
    public static int countsock(int[] arr, int n ){
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer> ();
        int  count, c, i, result =0;
        for (i =0; i<n; i++){
            if (map.containsKey(arr[i])){    
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
            else {
                map.put(arr[i], 1);
            }            
        }
        for (Integer value : map.values()) {
        result = result + (value/2);
        }
        System.out.println(Collections.singletonList(map));
        return result;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner (System.in);
        int n, i, result;
        System.out.println("Enter the number of socks");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the colour codes of the socks");
        for ( i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }       
        result = countsock(arr, n);
        System.out.println("The number of pairs of socks is : "+ result);
    }
}
