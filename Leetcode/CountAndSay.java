/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.Leetcode;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class CountAndSay {
    static String countsay(String s, int n){
        if(n==1){
            return "1";
        }
        if(n==2){
            return "11";
        }
        else{
            String res="";
            String temp = countsay(s,n-1);
            int count=0;
            for(int i=0;i<temp.length();i++){
                while (temp.charAt(i)==temp.charAt(i)){
                    count++;
                }
                res=res+(char)count+temp.charAt(i);                
            }
            return res;
        }
        
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String s ="";
        String result = countsay(s,n);
        System.out.println("The output is:" +result);
    }
}
