package LeetCode.OneTo100;

/**
 * @ClassName: No58
 * @Description: leetcode第58题，length of last word
 * @Author: Achilles
 * @Date: 03/01/2020  19:57
 * @Version: 1.0
 **/


public class No58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - 1 - i;
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(new No58().lengthOfLastWord("a "));
    }
}
