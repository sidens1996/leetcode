package SwordAtOffer;

/**
 * @ClassName: ReplaceSpace
 * @Description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Author: Achilles
 * @Date: 07/11/2019  20:15
 * @Version: 1.0
 **/

public class ReplaceSpace {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("We Are Happy");
        ReplaceSpace replaceSpace = new ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace(str));
    }

    public String replaceSpace(StringBuffer str) {

        int length = str.length();
        int i = 0;
        while(i < length) {
            if (str.charAt(i) == ' ') {
                str = new StringBuffer(str.substring(0, i) + "%20"+
                        str.substring(i + 1, length));
                length += 2;
            }
            i++;
        }
        return str.toString();
    }
}
