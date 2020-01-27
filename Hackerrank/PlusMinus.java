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
public class PlusMinus {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        double cp=0, cn=0, cz=0;
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                cz++;
            }
            if(arr[i] <0){
                cn++;
            }
            if(arr[i] >0){
                cp++;
            }
        }
        System.out.printf("%.6f %n",cp/n);
        System.out.printf("%.6f %n",cn/n);
        System.out.printf("%.6f %n",cz/n);
    }
}

