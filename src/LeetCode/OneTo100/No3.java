package LeetCode.OneTo100;

/**
 * @ClassName: No3
 * @Description: leetcode第三题，Longest substring without repeating characters
 * @Author: Achilles
 * @Date: 31/12/2019  19:49
 * @Version: 1.0
 **/

public class No3 {
//    public int lengthOfLongestSubstring(String s) {
//        StringBuilder stringBuilder = new StringBuilder();
//        int max = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int result = nonRecursion(s.substring(i));
//            max = max > result ? max : result;
//        }
//        return max;
//    }
//
//    public int nonRecursion(String s){
//        if (s.length() == 1){
//            return 1;
//        }else{
//            StringBuilder stringBuilder = new StringBuilder();
//            int m = 0;
//            for (int i = 0; i < s.length(); i++){
//                if(stringBuilder.toString().contains(String.valueOf(s.charAt(i)))){
//                    break;
//                }else{
//                    stringBuilder.append(String.valueOf(s.charAt(i)));
//                }
//            }
//            return stringBuilder.length();
//        }
//    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        for (int j = 0; j < chars.length; j++) {
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
                if (chars[innerIndex] == chars[j]) {
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }

    public static void main(String[] args) {
        System.out.println(new No3().lengthOfLongestSubstring("pwwkew"));
    }
}
