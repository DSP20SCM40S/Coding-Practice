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
public class CompareTheTriplets {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for Alice");
        int[] a = new int[3];
        int a_score= 0, b_score= 0;
        int[] b = new int[3];
        int[] c = new int[2];
        for(int i=0; i<3; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements for Bob");
        for(int i=0; i<3; i++){
            b[i]=sc.nextInt();
        }
        for(int i=0; i<3; i++){
            if(a[i]>b[i]){
               a_score++; 
            }
            else if(a[i]<b[i]){
                b_score++;
            }
        }
        c[0]= a_score;
        c[1]= b_score;
        for(int i=0; i<2; i++){
            System.out.print(c[i]+" ");
        }
    }
}
