package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No155
 * @Description: leetcode第155题，Min Stack
 * @Author: Achilles
 * @Date: 11/01/2020  21:37
 * @Version: 1.0
 **/

public class No155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.getMin();
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}

class MinStack {

    //    private int INIT_SIZE = 10;
//
//    private int min;
//    private Integer[] val;
//    private int top;
//
//    public MinStack() {
//        val = new Integer[this.INIT_SIZE];
//        top = -1;
//        min = Integer.MAX_VALUE;
//    }
//
//    public void push(int x) {
//        if (this.val.length - top < 5) {
//            Integer[] largerVal = new Integer[2 * this.val.length];
//            System.arraycopy(this.val, 0, largerVal, 0, top + 1);
//            this.val = largerVal;
//        }
//        this.val[++top] = x;
//        min = Math.min(x, min);
//    }
//
//    public void pop() {
//        if (top >= 0) {
//            top--;
//            Integer[] temp = new Integer[top + 1];
//            System.arraycopy(val, 0, temp, 0, top + 1);
//            this.min = Collections.min(Arrays.asList(temp));
//        }
//    }
//
//    public int top() {
//        return this.val[top];
//    }
//
//    public int getMin() {
//        return this.min;
//    }
    BinLinkedNode top = null;

    public MinStack() {
    }

    public void push(int x) {
        BinLinkedNode newNode = new BinLinkedNode();
        newNode.val = x;
        if (top != null) {
            top.next = newNode;
            newNode.pre = top;
            newNode.min = Math.min(x, top.min);
            top = newNode;
        } else {
            top = newNode;
            top.min = x;
        }
    }

    public void pop() {
        if (top != null) {
            top = top.pre;
            if (top != null) {
                top.next = null;
            }
        }
    }

    public int top() {
        if (top != null) {
            return top.val;
        }
        return -1;
    }

    public int getMin() {
        return top.min;
    }

    class BinLinkedNode {
        private int val;
        private int min;
        private BinLinkedNode pre;
        private BinLinkedNode next;
    }

}
