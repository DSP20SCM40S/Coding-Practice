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
public class CountingValleys {
    public static int count(int n, String s){
        int l = s.length(), i, level =0, count = 0;
        char ch;
        for (i=0; i<l;i++){
            ch = s.charAt(i);
            if((ch=='u') || (ch=='U')){
                level++;
            }
            else if ((ch=='d' || (ch == 'D'))){
                if (level == 0){
                count++;
                }
                level--;
            }                         
        }
        return count;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n, result;
        String s;
        System.out.println("Enter the number of steps");
        n = sc.nextInt();
        System.out.println("Enter the steps sequence");
        s=sc.next();
        result = count(n,s);
        System.out.println("The number of Valleys walked through is :"+ result);
    }
}
