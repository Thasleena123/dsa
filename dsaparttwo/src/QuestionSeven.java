//7. Longest Substring with K Distinct Characters
//Problem Statement
//-------------
//Given an algorithm that takes a string and integer K and returns the length of the longest substring with no more than K distinct characters.

import java.util.HashMap;

public class QuestionSeven {
    public  static int longestSubstring(String word,int k){
        if(k==0){
            return 0;
        }
        HashMap<Character ,Integer> charcount= new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<=word.length()-1;right++){
            charcount.put(word.charAt(right),charcount.getOrDefault(word.charAt(right),0)+1);
            while(charcount.size()>k){
                char leftchar=word.charAt(left);
                charcount.put(leftchar,charcount.get(leftchar)-1);
                if(charcount.get(leftchar)==0){
                    charcount.remove(leftchar);
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public  static  void main(String[]args){
        String word="addaba";
        int k=2;
        System.out.println(longestSubstring(word,k));
    }

}
