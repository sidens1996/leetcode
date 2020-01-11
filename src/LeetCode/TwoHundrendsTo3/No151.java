package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No151
 * @Description: leetcode第151题
 * @Author: Achilles
 * @Date: 11/01/2020  18:52
 * @Version: 1.0
 **/

public class No151 {
    public String revereWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        if (s.length() == 0) {
            return s;
        }
        int right = s.length() - 1, left = right;
        for (; left > 0; left--) {
            while (s.charAt(right) == ' ' && right > 0) right--;
            if (s.charAt(left - 1) == ' ' && s.charAt(left) != ' ') {
                stringBuilder.append(s.substring(left, right + 1)).append(' ');
                right = left - 1;
            }
        }
        stringBuilder.append(s.substring(left, right + 1));
        // 去掉最后面的空格
        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            if (stringBuilder.charAt(i) != ' ') {
                break;
            }
            stringBuilder.deleteCharAt(i);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No151().revereWords("the sky is blue"));
    }
}
