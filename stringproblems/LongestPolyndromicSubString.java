//GFG link for this problem  https://www.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1
package stringproblems;

public class LongestPolyndromicSubString {
    static String longestPalindrome(String s) {
        if(s.length()==0||s.length()==1) return s;
        String longest=s.substring(0,1);
        
        for(int i=0;i<s.length();i++){
            String temp=helper(s,i,i);
            if(temp.length()>longest.length()) longest=temp;
            temp=helper(s,i,i+1);
            if(temp.length()>longest.length()) longest=temp;
        }
        return longest;
        
    }
    static String helper(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}

