/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewquestions;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class AddOneToNumber {
    static int addone(int[] arr,int n){
        int num=0;
        for(int i=0; i<n;i++){
            num=num*10+arr[i];
        }
        return num+1;
    }
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int result = addone(arr, n);
        System.out.println(result);
    }
}
