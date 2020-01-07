package LeetCode.OneTo100;

/**
 * @ClassName: No28
 * @Description: leetcode第28题，Implement strStr()
 * @Author: Achilles
 * @Date: 02/01/2020  15:39
 * @Version: 1.0
 **/

public class No28 {
    public int strStr(String haystack, String needle) {
        if (needle == "" || needle == null){
            return 0;
        }else {
            for (int i = 0;i < haystack.length(); i++){
                if ((i + needle.length()) < haystack.length() && haystack.substring(i, i + needle.length()).equals(needle)){
                    return i;
                }
            }
            return -1;
        }
    }
}
