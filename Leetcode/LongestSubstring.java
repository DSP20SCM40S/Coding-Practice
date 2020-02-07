/*
 Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
package coding.Leetcode;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class LongestSubstring {
    static int longestsequence(String s){
        HashMap<Character, String> map = new HashMap<>();   
        char ch;
        char prev=' ';
        String result=" ";
        String temp;
        int n =s.length();
        for(int i=0;i<n;i++){
            ch=s.charAt(i);
            if(map.containsKey(ch)){
                result=map.get(prev);
                map.clear();
                temp=Character.toString(ch);
                map.put(ch, temp);
            }
            else{ 
                temp=map.get(prev)+ch;
                map.put(ch,temp);
                prev=ch;
            }
        }
        result = result.replaceAll("null", "");
        int len = result.length();
        System.out.println(result);
        return len;
    }
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        int result=longestsequence(s);
        System.out.println("The longest subsequesce is "+result);
    }
}
