package LeetCode.OneTo100;

/**
 * @ClassName: No7
 * @Description: leetcode第七题，reverse integer
 * @Author: Achilles
 * @Date: 01/01/2020  14:28
 * @Version: 1.0
 **/

public class No7 {
    public int reverse(int x) {
        int flag = 1;
        int result = 0;
        if ( x <= 0){
            flag = -1;
            x = x * (-1);
        }else {
            flag = 1;
        }
        int times = (int)Math.log10(x);
        while (x >= 1){
            result  = result + (int)(Math.pow(10, times) * (x % 10));
            if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE){
                return 0;
            }
            times--;
            x = x / 10;
        }
        result = result * flag;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new No7().reverse(-123));

    }
}
