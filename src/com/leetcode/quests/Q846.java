package com.leetcode.quests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 846. 一手顺子
 * 爱丽丝有一手（hand）由整数数组给定的牌。
 * 现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。
 * 如果她可以完成分组就返回 true，否则返回 false。
 */
public class Q846 {
    public static void main(String[] args) {
        System.out.println(isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        System.out.println(isNStraightHand(new int[]{1, 1, 2, 2, 3, 3}, 2));
    }

    public static boolean isNStraightHand(int[] hand, int W) {
        int n = hand.length;
        if (n % W != 0) return false;
        /*List<Integer> list = Arrays.stream(hand).boxed().collect(Collectors.toList());
        for (int j = 0; j < n / W; j++) {
            int min = Collections.min(list);
            for (int i = 0; i < W; i++) {
                if (list.contains(min + i)) {
                    list.remove(Integer.valueOf(min + i));
                } else {
                    return false;
                }
            }
        }*/
        Arrays.sort(hand);
        boolean[] visited = new boolean[n];
        int i = 0;
        while (i < n) {
            if (!visited[i]) {
                int key = hand[i], j = i;//从i往后找w个
                while (key < hand[i] + W) {
                    if (j >= n) return false;
                    if (!visited[j] && key == hand[j]) {
                        visited[j] = true;
                        key++;
                    }
                    j++;
                }
            }
            i++;
        }

        return true;
    }
}
