package LeetCode.OneTo100;

import java.util.Arrays;

/**
 * @ClassName: No66
 * @Description: leetcode第66题，Plus One
 * @Author: Achilles
 * @Date: 03/01/2020  20:34
 * @Version: 1.0
 **/

public class No66 {
    public int[] plusOne(int[] digits) {
        int flag = 1;
        int cur = 0;
        // 1位的情况
        for (int i = digits.length - 1; i >= 0; i--) {
            cur = digits[i] + flag;
            digits[i] = cur % 10;
            flag = cur / 10;
        }
        if (flag > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No66().plusOne(new int[]{9, 9, 9})));
    }
}
