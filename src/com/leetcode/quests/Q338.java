package com.leetcode.quests;

import java.util.Arrays;

/**
 * 338. 比特位计数
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 */
public class Q338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(Arrays.toString(countBits((int) Math.pow(2,6))));
    }
    public static int[] countBits(int num) {
        int[] counts = new int[num + 1];
       /* for (int i = 0; i <= num; i++) {
            counts[i] = (int) Integer.toBinaryString(i).chars().filter(t -> t == '1').count();
        }*/

        return counts;

    }
}
