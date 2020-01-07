package LeetCode.OneTo100;

/**
 * @ClassName: No50
 * @Description: leetcode第50题，实现幂函数
 * @Author: Achilles
 * @Date: 03/01/2020  18:49
 * @Version: 1.0
 **/

public class No50 {
    double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        double ans = 1;
        double cur = x;
        for (long i = N; i > 1; i /= 2) {
            if (i % 2 == 1) {
                ans *= cur;
            }
            cur *= cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new No50().myPow(2, 10));
    }
}
