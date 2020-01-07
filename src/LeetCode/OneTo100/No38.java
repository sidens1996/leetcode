package LeetCode.OneTo100;

/**
 * @ClassName: No38
 * @Description: leetocode第38题，表示数
 * @Author: Achilles
 * @Date: 03/01/2020  17:00
 * @Version: 1.0
 **/

public class No38 {

    public String countAndSay(int n) {
        String cur = "1";
        for (int i = 1;i < n; i++){
            int left = 0;
            int j = 0;
            StringBuilder temp = new StringBuilder();
            for(j = 0;j < cur.length(); j++){
                if (cur.charAt(left) != cur.charAt(j)){
                    temp.append(j - left).append(cur.charAt(left) - '0');
                    left = j;//重新记录位置
                }
            }
            if (j - left > 0 && cur.charAt(left) == cur.charAt(cur.length() - 1)) {
                temp.append(j - left).append(cur.charAt(cur.length() - 1) - '0');
            }
            cur = temp.toString();
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(new No38().countAndSay(6));

    }
}
