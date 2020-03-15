package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No171
 * @Description: Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/excel-sheet-column-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: Achilles
 * @Date: 15/03/2020  22:24
 * @Version: 1.0
 **/

public class No171 {
    public int titleToNumber(String s) {
        int num = 0, count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            num += (s.charAt(i) - 'A' + 1) * Math.pow(26, count++);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new No171().titleToNumber("AB"));
    }
}
