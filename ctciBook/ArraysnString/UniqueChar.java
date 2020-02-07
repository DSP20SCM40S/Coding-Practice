/*
 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
assumptions only 128 ascii characters
 */
package coding.ctciBook.ArraysnString;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class UniqueChar {
    static Boolean checkunique(String s){
        int n=s.length();
        if(n>128){
            return false;
        }
        boolean[] charset=new boolean[128];
        for(int i=0;i<n;i++){
            int val=s.charAt(i);
            if(charset[val]==true){
                return false;
            }            
            charset[val]=true;
        }
        return true;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        Boolean result=checkunique(s);
        System.out.println(result);
    }
}
