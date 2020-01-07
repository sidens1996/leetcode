package SwordAtOffer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @ClassName: FloorOfBigNumber
 * @Description: TODO
 * @Author: Achilles
 * @Date: 06/11/2019  09:20
 * @Version: 1.0
 **/

public class FloorOfBigNumber {

    public static void main(String[] args){
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            input = scanner.nextInt();
        }
        scanner.close();
        FloorOfBigNumber floorOfBigNumber = new FloorOfBigNumber();
        System.out.println(floorOfBigNumber.floor(input));
    }

    // timeout,uses iteration
    public BigInteger floor(int n){

        BigInteger res = BigInteger.valueOf(0);
        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);
        if (n <= 2)
            return res.valueOf(n);
        for(int i = 0;i < n - 2;i++){
            res = one.add(two);
            one = two;
            two = res;
        }
        return res;
    }

    public String floor2(int n){
        String res = "0";
        String one = "1";
        String two = "2";
        if(n <= 2){
            res = "";
            res += n;
        }
        for(int i = 0;i < n - 2;i++){

            res = add(one,two);
            one = two;
            two = res;
        }
        return res;
    }

    public String add(String a,String b){

        // add two big numbers
        // firstly reverse the strings
        String a_reverse = new StringBuilder(a).reverse().toString();
        String b_reverse = new StringBuilder(b).reverse().toString();
        int maxLength = Math.max(a_reverse.length(), b_reverse.length());
        int minLength = Math.min(a_reverse.length(), b_reverse.length());
        // define the flowOut number
        int flowOut = 0;
        // record the added result
        int addResult = 0;
        // To store the added result
        StringBuilder result = new StringBuilder(maxLength + 1);
        for (int i = 0; i < minLength; i++) {
            addResult = (a_reverse.charAt(i) - '0') + (b_reverse.charAt(i) - '0') + flowOut;
            flowOut = addResult / 10;
            addResult = addResult % 10;
            result.append(addResult);
        }
        for (int i = minLength; i < maxLength; i++) {
            if (a_reverse.length() >= b_reverse.length()) {
                addResult = a_reverse.charAt(i) - '0' + flowOut;
                flowOut = addResult / 10;
                addResult = addResult % 10;
            } else {
                addResult = b_reverse.charAt(i) - '0' + flowOut;
                flowOut = addResult / 10;
                addResult = addResult % 10;
            }
            result.append(addResult);
        }
        if (flowOut != 0) {
            result.append(flowOut);
        }

        return result.reverse().toString();
    }
}
