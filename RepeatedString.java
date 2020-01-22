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
public class RepeatedString {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        String a ="";
        System.out.println("Enter the number of times the string is repeated");
        int n = sc.nextInt();
        int i=0,j=0;
        long count = 0;

        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a')
             count++;
        }

        long div = n/s.length();
        long reminder = n%s.length();
    
         count = div*count;

         for(i=0; i<reminder; i++){
            if(s.charAt(i) == 'a')
               count++;
         }
        System.out.println("The number of times a appears in the string is: "+count);        
    }
}