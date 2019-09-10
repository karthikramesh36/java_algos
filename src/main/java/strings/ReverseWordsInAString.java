package strings;

import java.util.Stack;

public class ReverseWordsInAString {
/*
 * Given an input string, reverse the string word by word.

Example:  

Input: "the sky is blue",
Output: "blue is sky the".
Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.

 */
	
	public String reverseWords(String s) {
        String[] original = s.split(" ");
        Stack<String> stack = new Stack<String>();
        for(String str : original){
             if(!str.trim().equals(""))
                stack.push(str);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop().trim());
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
	
	
	/*
	 * Given an input string , reverse the string word by word. 

Example:

Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
Note: 

A word is defined as a sequence of non-space characters.
The input string does not contain leading or trailing spaces.
The words are always separated by a single space.
Follow up: Could you do it in-place without allocating extra space?
	 */
	
	 public void reverseWordsII(char[] str) {
	        int start =0;
	        for(int end =0; end < str.length-1 ; end++){
	            if(str[end] == ' '){
	                reverse(str,start,end-1);
	                start = end +1;
	            }
	        }
	        
	        reverse(str,start,str.length-1);
	        reverse(str,0,str.length-1);
	    }
	    
	    public void reverse(char[] s,int start,int end){
	        for(;start<end;start++,end--){
	            char temp =s[start];
	            s[start] = s[end];
	            s[end] = temp;
	        }
	    }
}
