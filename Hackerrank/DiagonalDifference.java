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
public class DiagonalDifference {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner (System.in);
        int d1=0, d2=0, sum;
        System.out.println("Enter the size of the square matrix");
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0, j=n-1; i<n; i++, j--){
            d1 = d1+ arr[i][i];
            d2 = d2+ arr[i][j];
        }
        sum = d1-d2;
        System.out.println(Math.abs(sum));
    }
}
