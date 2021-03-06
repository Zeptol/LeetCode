package com.leetcode.quests;

import java.util.*;

/**
 * 1178. 猜字谜
 * 外国友人仿照中国字谜设计了一个英文版猜字谜小游戏，请你来猜猜看吧。
 * <p>
 * 字谜的迷面 puzzle 按字符串形式给出，如果一个单词 word 符合下面两个条件，那么它就可以算作谜底：
 * <p>
 * 单词 word 中包含谜面 puzzle 的第一个字母。
 * 单词 word 中的每一个字母都可以在谜面 puzzle 中找到。
 * 例如，如果字谜的谜面是 "abcdefg"，那么可以作为谜底的单词有 "faced", "cabbage", 和 "baggage"；而 "beefed"（不含字母 "a"）以及 "based"（其中的 "s" 没有出现在谜面中）。
 * 返回一个答案数组 answer，数组中的每个元素 answer[i] 是在给出的单词列表 words 中可以作为字谜迷面 puzzles[i] 所对应的谜底的单词数目。
 */
public class Q1178 {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        int wn = words.length;
        int pn = puzzles.length;
        List<Integer> answers = new ArrayList<>();
        for (String puzzle : puzzles) {
            var answer = 0;
            for (String word : words) {
                if (word.indexOf(puzzle.charAt(0)) > -1) {
                    char[] chars = word.toCharArray();
                    if (Arrays.asList(puzzle.toCharArray()).containsAll(Arrays.asList(chars))) {
                        answer++;
                    }
                }
            }
            answers.add(answer);
        }
        return answers;
    }
}
