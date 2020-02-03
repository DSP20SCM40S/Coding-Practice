/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.Leetcode;
import static coding.Leetcode.SearchInsertPosition.searchposition;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class ReverseInteger {
    static int reverse(int x){
        boolean negative = false;
        if (x<0){
            negative = true;
            x*=-1;
        }
        long reversed = 0;
        while(x>0){
            reversed = (reversed*10)+(x%10);
            x/=10;
        }
        if(reversed > Integer.MAX_VALUE){
            return 0;
        }
        return negative?(int)(-1*reversed): (int)reversed;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n = sc.nextInt();               
        int result = reverse(n);
        System.out.println("The reversed number is "+result);
    }
}
