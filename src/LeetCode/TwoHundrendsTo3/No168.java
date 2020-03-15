package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No168
 * @Description: leetcode第16题
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * @Author: Achilles
 * @Date: 15/03/2020  21:16
 * @Version: 1.0
 **/

public class No168 {
    public String covertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            n--;
            stringBuilder.append((char) ('A' + n % 26));
            n = n / 26;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new No168().covertToTitle(701));
    }
}
