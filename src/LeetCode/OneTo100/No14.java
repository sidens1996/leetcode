package LeetCode.OneTo100;

/**
 * @ClassName: No14
 * @Description: leetcode第14题，longest common prefix
 * @Author: Achilles
 * @Date: 01/01/2020  16:35
 * @Version: 1.0
 **/

public class No14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flower"};
        System.out.println(new No14().longestCommonPrefix(strs));
    }
}
