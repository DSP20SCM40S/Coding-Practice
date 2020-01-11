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
public class JumpingOnTheClouds {
    public static int count(int n, int arr[]){
        int a =0, count =0;
        for(int i=0; i<n; i++, count++){
            if( i<(n-2) && arr[i+2]==0){
                i++;
            }
        }
        return count;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i, result;
        System.out.println("Enter the size number of clouds");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the description of the clouds");
        for(i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        result = count(n,arr);
        System.out.println("The minimum number of jumps required is : "+ result);
    }
}

