/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class BubbleSort {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
