package LeetCode.TwoHundrendsTo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: No118
 * @Description: leetcode第118题，Pascal's Triangle
 * @Author: Achilles
 * @Date: 06/01/2020  18:22
 * @Version: 1.0
 **/

public class No118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        if (numRows == 0) {
            return lists;
        } else {
            lists.add(list1);
            for (int level = 1; level < numRows ; level++) {
                List<Integer> list = new ArrayList<>(numRows);
                list.add(1);
                for (int j = 1; j <= level - 1; j++) {
                    int one = lists.get(level - 1).get(j - 1);
                    int two = lists.get(level - 1).get(j);
                    list.add(j, one + two);
                }
                list.add(1);
                lists.add(list);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(new No118().generate(3));
    }
}
