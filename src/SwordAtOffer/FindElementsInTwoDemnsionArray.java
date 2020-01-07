package SwordAtOffer;

/**
 * @ClassName: FindElementsInTwoDemnsionArray
 * @Description: 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Author: Achilles
 * @Date: 07/11/2019  18:05
 * @Version: 1.0
 **/

public class FindElementsInTwoDemnsionArray {

    public static void main(String[] args) {

        int target = 7;
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        FindElementsInTwoDemnsionArray f = new FindElementsInTwoDemnsionArray();
        System.out.println(f.Find2(target, array));
    }

    // 暴力解决
    // 运行时间：154ms
    //
    //占用内存：17292k
    public boolean Find(int target, int[][] array) {
        int row = array.length;
        int column = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 找规律
    // 从左下开始遍历，本质上还是遍历整个数组
    // 运行时间：169ms
    //
    // 占用内存：17564k
    public boolean Find2(int target, int[][] array) {
        int row = array.length;
        int column = array[0].length;

        int i = row - 1;//横坐标
        int j = 0;
        while (i >= 0 && j < column) {
            if (array[i][j] > target) {
                i--;
            } else if (array[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

    // 二分查找，先二分在一行内找出符合的范围，然后在列里找
    public boolean Find3(int target, int[][] array) {
        int row = array.length;
        int column = array[0].length;

        return true;


    }
}
