package LeetCode.OneTo100;

/**
 * @ClassName: No9
 * @Description: leetcode第九题，palindrome number
 * @Author: Achilles
 * @Date: 01/01/2020  15:01
 * @Version: 1.0
 **/

public class No9 {

    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }else {
            return calcuate(x) == x ? true : false;
        }
    }

    public int calcuate(int x){
        int result = 0;
        while (x != 0){
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
