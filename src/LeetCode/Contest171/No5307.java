package LeetCode.Contest171;

import java.util.Arrays;

/**
 * @ClassName: No5307
 * @Description: leetcode第171场周赛第1题
 * 「无零整数」是十进制表示中 不含任何 0 的正整数。
 *
 * 给你一个整数 n，请你返回一个 由两个整数组成的列表 [A, B]，满足：
 *
 * A 和 B 都是无零整数
 * A + B = n
 * 题目数据保证至少有一个有效的解决方案。
 *
 * 如果存在多个有效解决方案，你可以返回其中任意一个。
 * @Author: Achilles
 * @Date: 12/01/2020  10:41
 * @Version: 1.0
 **/

public class No5307 {
    public int[] getNoZeroIntegers(int n) {
        Integer a = 1;
        Integer b = n - a;
        while (a.toString().contains("0") || b.toString().contains("0")) {
            a++;
            b--;
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No5307().getNoZeroIntegers(11)));
    }
}
