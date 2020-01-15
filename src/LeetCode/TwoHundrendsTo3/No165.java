package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No165
 * @Description: leeetcode第165题，Compare Version Numbers
 * @Author: Achilles
 * @Date: 15/01/2020  21:38
 * @Version: 1.0
 **/

public class No165 {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        for (int i = 0; i < Math.max(s1.length, s2.length); i++) {
            int s1Value = i < s1.length ? Integer.parseInt(s1[i]) : 0;
            int s2Value = i < s2.length ? Integer.parseInt(s2[i]) : 0;
            if (s1Value > s2Value) return 1;
            else if (s1Value < s2Value) return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new No165().compareVersion("0.1", "1.1"));
    }
}
