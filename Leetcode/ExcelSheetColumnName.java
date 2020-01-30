/*
 Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
Example 1:

Input: 1
Output: "A"
Example 2:

Input: 28
Output: "AB"
Example 3:

Input: 701
Output: "ZY"
 */
package coding.Leetcode;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class ExcelSheetColumnName {
    static String ColumnName(int inp){
        String result = "";
        if(inp <= 0)
            return result;
    
        while(inp > 0){       
            inp--;
            int ch = inp%26;
            result = Character.toString((char)(ch + 65)) + result;
            inp = inp/26;
        }
        return result; 
}
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        String result = ColumnName(inp);
        System.out.println("The Column Name is:" +result);
    }
}