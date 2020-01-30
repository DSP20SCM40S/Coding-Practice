/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.Miscellaneous;
import java.io.*;
import java.util.*;
/**
 *
 * @author Disha Sharma
 */
public class RecurringDecimal {
    static String frac(int n, int m){
        if( n==0 ){
            return "0";
        }
        if( m==0 ){
            return "";
        }
        String result="";
        if(n<0 || m<0){
            result+="-";
        }
        long num = n;
        long den = m;
        num = Math.abs(num);
        den = Math.abs(den);
        long res = num/den;
        result+=String.valueOf(res);
        long remainder = (num%den)*10;
        if(remainder == 0){
            return result;
        }
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        result+=".";
        while(remainder!=0){
            if(map.containsKey(remainder)){
                int beg = map.get(remainder);
                String part1 = result.substring(0,beg);
                String part2 = result.substring(beg,result.length());
                result = part1 +"("+part2+")";
                return result;
            }
            map.put(remainder,result.length());
            res = remainder/den;
            result+=String.valueOf(res);
            remainder = (remainder%den)*10;            
        }
        return result;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int n=sc.nextInt();
        System.out.println("Enter the denomenator");
        int m=sc.nextInt();
        String res = frac(n,m);
        System.out.println(res);
    }
}
