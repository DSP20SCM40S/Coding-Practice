/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.ctciBook.ArraysnString;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class IsPermutation {
    static boolean permutation(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] letters = new int[128];
        char[] str=str1.toCharArray();
        for(char c: str){
            letters[c]++;
        }
        for(int i=0;i<str2.length();i++){
            int c=(int)str2.charAt(i);
            letters[c]--;
            if(letters[c]<0) return false;            
        }
        return true;
    }
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String");
        String str1=sc.next();
        System.out.println("Enter the Second String");
        String str2=sc.next();
        boolean result=permutation(str1, str2);
        System.out.println(result);
    }
}
