import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner s = new Scanner(System.in);
          int testCases = s.nextInt();
          for ( int i =0 ; i< testCases; i++) {
              int palIndex = getPalIndex(s.next());
              System.out.println(palIndex);
          }
        
    }
    
    public static int getPalIndex(String s) {
       char[] d = s.toCharArray();
       int start = 0;
       int end = s.length() -1;
       int palIndex = -1;
       // To check for palindrome, we traverse the string using from beginning and end and compare those letters.
       while ( start <= end ) {
           if  ( d[start] == d[end] ) {
               // move to next character
               start++;
               end--;
           } 
           else {
               if ( d[start+1] == d[end]) {
                   // now remove start character
                   palIndex = start;
               }
               else {
                // this char needs to be removed
                palIndex = end;    
               }
               break;
           }
           
       }
       return palIndex;
    }
}
