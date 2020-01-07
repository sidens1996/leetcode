package LeetCode.OneTo100;

/**
 * @ClassName: No70
 * @Description: leetcode第70题，climbing stairs
 * @Author: Achilles
 * @Date: 04/01/2020  14:08
 * @Version: 1.0
 **/

public class No70 {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
            int f1 = 1;
            int f2 = 2;
            int f3 = 0;
            for (int i = 2; i < n; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            return f3;
        }

    }
}
