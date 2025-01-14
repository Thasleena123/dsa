//Find all Palindrome Substrings
//Problem Statement
//------------------
//Write an algorithm that takes a string and finds all non-single letter palindromes within the input string

import java.util.ArrayList;
import java.util.List;

public class QuestionSix {
    public static List<String> PalindromesCheck(String str) {
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > 1) {
                    palindromes.add(substring);
                }
            }
        }
        return palindromes;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abacbaa";
        List<String> result = PalindromesCheck(str);
        for (String palindrome : result) {
            System.out.println(palindrome);
        }
    }
}


