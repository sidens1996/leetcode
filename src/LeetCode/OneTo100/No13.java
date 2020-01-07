package LeetCode.OneTo100;

import sun.security.krb5.internal.SeqNumber;

/**
 * @ClassName: No13
 * @Description: leetcode第13题，Roman to Integer
 * @Author: Achilles
 * @Date: 01/01/2020  15:21
 * @Version: 1.0
 **/

public class No13 {

    public int romanToInt(String s) {
        int result = 0;
        char[] ch = s.toCharArray();
        for (int i = 0;i < ch.length - 1; i++){
            if (singChar(ch[i]) >= singChar(ch[i + 1])) {
                result += singChar(ch[i]);
            } else {
                result -= singChar(ch[i]);
            }
        }
        result += singChar(ch[ch.length - 1]);
        return result;
    }

    public int singChar(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
