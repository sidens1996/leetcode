package LeetCode.Contest171;

/**
 * @ClassName: No5308
 * @Description: leetcode第171场周赛第2题
 * 给你三个正整数 a、b 和 c。
 *
 * 你可以对 a 和 b 的二进制表示进行位翻转操作，返回能够使按位或运算   a OR b == c  成立的最小翻转次数。
 *
 * 「位翻转操作」是指将一个数的二进制表示任何单个位上的 1 变成 0 或者 0 变成 1 。
 * @Author: Achilles
 * @Date: 12/01/2020  10:55
 * @Version: 1.0
 **/

public class No5308 {

    public int minFlips(int a, int b, int c) {
        int result = 0;
        StringBuilder binA = new StringBuilder(Integer.toBinaryString(a)).reverse();
        StringBuilder binB = new StringBuilder(Integer.toBinaryString(b)).reverse();
        StringBuilder binC = new StringBuilder(Integer.toBinaryString(c)).reverse();
        for (int i = 0; i < Math.max(Math.max(binA.length(), binB.length()), binC.length()); i++) {
            int bitA = i < binA.length() ? binA.charAt(i) - '0' : 0;
            int bitB = i < binB.length() ? binB.charAt(i) - '0' : 0;
            int bitC = i < binC.length() ? binC.charAt(i) - '0' : 0;
            // 四种情况 010,100,110,001
            if ((bitA | bitB) != bitC) {
                if (bitA == 0 && bitB == 1 && bitC == 0) result += 1;
                else if (bitA == 1 && bitB == 0 && bitC == 0) result += 1;
                else if (bitA == 1 && bitB == 1 && bitC == 0) result += 2;
                else if (bitA == 0 && bitB == 0 && bitC == 1) result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new No5308().minFlips(2, 6, 5));
    }
}
