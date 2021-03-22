package com.leetcode.quests;

/**
 * 191. 位1的个数
 */
public class Q191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(0b00000000000000000000000000001011));
        System.out.println(hammingWeight(0b00000000000000000000000010000000));
        System.out.println(hammingWeight(-3));
        System.out.println(Integer.toBinaryString(-3));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int i = 0, total = 0;
        do {
            if ((n & 1) == 1) total++;
            n >>= 1;
            i++;
        } while (i < 32);
        return total;
    }
}
