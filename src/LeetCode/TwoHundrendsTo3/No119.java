package LeetCode.TwoHundrendsTo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: No119
 * @Description: leetcode第119题，Pascal's Triangle II
 * @Author: Achilles
 * @Date: 06/01/2020  19:24
 * @Version: 1.0
 **/

public class No119 {
    public List<Integer> getRow(int rowIndex) {
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        lists.add(list1);
//        for (int level = 1; level <= rowIndex; level++) {
//            List<Integer> list = new ArrayList<>();
//            list.add(1);
//            for (int j = 1; j < level - 1; j++) {
//                list.add(lists.get(level - 1).get(j - 1) + lists.get(level - 1).get(j));
//            }
//            list.add(1);
//            lists.add(list);
//        }
//        return lists.get(rowIndex);
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp, 1);
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = 1; j <= i - 1; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return Arrays.asList(dp);
    }

    public static void main(String[] args) {
        System.out.println(new No119().getRow(3));
    }
}
