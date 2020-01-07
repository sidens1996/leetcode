package LeetCode.OneTo100;

/**
 * @ClassName: No67
 * @Description: leetcode第67题，Add Binary
 * @Author: Achilles
 * @Date: 03/01/2020  21:13
 * @Version: 1.0
 **/

public class No67 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int cur = 0;
        int flag = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (; i >= 0 && j >= 0; i--, j--) {
            cur = a.charAt(i) - '0' + b.charAt(j) - '0' + flag;
            flag = cur / 2;
            cur = cur % 2;
            stringBuilder.insert(0, cur);
        }
        if (i >= 0) {
            for (int x = i; x >= 0; x--) {
                cur = a.charAt(x) - '0' + flag;
                flag = cur / 2;
                cur = cur % 2;
                stringBuilder.insert(0, cur);
            }
        }
        if (j >= 0){
            for (int x = j; x >= 0; x--) {
                cur = b.charAt(j) - '0' + flag;
                flag = cur / 2;
                cur = cur % 2;
                stringBuilder.insert(0, cur);
            }
        }
        if (flag > 0) {
            stringBuilder.insert(0, flag);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No67().addBinary("1010", "1011"));
    }
}
