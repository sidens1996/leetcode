package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No125
 * @Description: leetcode第125题，Valid Palindrome
 * @Author: Achilles
 * @Date: 07/01/2020  19:17
 * @Version: 1.0
 **/

public class No125 {
    public boolean isPalindrome(String s) {
        if (s == null || s.equals("")) {
            return true;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                        (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                        (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    stringBuilder.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
            }
            String raw = stringBuilder.toString();
            String reverse = stringBuilder.reverse().toString();
            if (raw.equals(reverse)) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new No125().isPalindrome("Aa"));
    }
}