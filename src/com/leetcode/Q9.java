package com.leetcode;

public class Q9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String str = String.valueOf(x);
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
