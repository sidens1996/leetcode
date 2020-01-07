package LeetCode.OneTo100;

/**
 * @ClassName: No69
 * @Description: leetcode第69题，Sqrt()
 * @Author: Achilles
 * @Date: 03/01/2020  22:12
 * @Version: 1.0
 **/

public class No69 {
    public int mySqrt(int x) {
        long x0 = x >> 1;
        while(x0 * x0 > x){
            x0 = (x0 + x / x0) >> 1;
        }
        return (int)x0;
    }

    public static void main(String[] args) {
        System.out.println(new No69().mySqrt(2147483647));
    }
}
