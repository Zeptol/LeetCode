package com.leetcode;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 205. 同构字符串
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以被替换得到 t，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 */
public class Q205 {
    public static void main(String[] args) {
        System.out.println("isIsomorphic(\"egg\",\"foo\") = " + isIsomorphic("egg", "add"));
        System.out.println("isIsomorphic(\"foo\",\"bar\") = " + isIsomorphic("foo", "bar"));
        System.out.println("isIsomorphic(\"paper\",\"title\") = " + isIsomorphic("paper", "title"));
        System.out.println("isIsomorphic(\"cb\",\"aa\") = " + isIsomorphic("cb", "aa"));
        System.out.println("isIsomorphic(\"aa\",\"ab\") = " + isIsomorphic("aa", "ab"));
        System.out.println("isIsomorphic(\"ab\",\"ca\") = " + isIsomorphic("ab", "ca"));
    }

   /* private static boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) return false;
        }
        return true;
    }*/
/*
    private static boolean isIsomorphic(String s, String t) {
        class Tuple {
            char k;
            char v;

            Tuple(char k, char v) {
                this.k = k;
                this.v = v;
            }
        }
        var list = new ArrayList<Tuple>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            char c = sArr[i];
            char ct = tArr[i];
            List<Tuple> pair = list.stream().filter(o -> o.k == c).collect(Collectors.toList());
            List<Tuple> pair2 = list.stream().filter(o -> o.v == ct).collect(Collectors.toList());
            if (!pair.isEmpty()) {
                Tuple tuple = pair.get(0);
                if (ct != tuple.v) return false;
            } else if (!pair2.isEmpty()) {
                Tuple tuple = pair2.get(0);
                if (tuple.k != c) return false;
            } else list.add(new Tuple(c, ct));
        }
        return true;
    }
*/
    private static boolean isIsomorphic(String s, String t) {
        var map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char ct = t.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) != ct) return false;
            } else if (map.containsValue(ct)) {
                return false;
            } else map.put(c, ct);
        }
        return true;
    }
}
