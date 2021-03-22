package com.leetcode.quests;

public class Q12 {
    final int Len = 4;
    public String intToRoman(int num) {
        var arr = new String[Len];
        for (int i = 0; i < Len; i++) {
            arr[Len - 1 - i] = getKey(num % 10, i);
            num /= 10;
        }
        return String.join("", arr);
    }

    private String getKey(int n, int digitIndex) {
        switch (n){
            case 1:
                switch (digitIndex){
                    case 0:return "I";
                    case 1:return "X";
                    case 2:return "C";
                    case 3:return "M";
                }
            case 2:
                switch (digitIndex){
                    case 0:return "II";
                    case 1:return "XX";
                    case 2:return "CC";
                    case 3:return "MM";
                }
            case 3:
                switch (digitIndex){
                    case 0:return "III";
                    case 1:return "XXX";
                    case 2:return "CCC";
                    case 3:return "MMM";
                }
            case 4:
                switch (digitIndex){
                    case 0:return "IV";
                    case 1:return "XL";
                    case 2:return "CD";
                }
            case 5:
                switch (digitIndex){
                    case 0:return "V";
                    case 1:return "L";
                    case 2:return "D";
                }
            case 6:
                switch (digitIndex){
                    case 0:return "VI";
                    case 1:return "LX";
                    case 2:return "DC";
                }
            case 7:
                switch (digitIndex){
                    case 0:return "VII";
                    case 1:return "LXX";
                    case 2:return "DCC";
                }
            case 8:
                switch (digitIndex){
                    case 0:return "VIII";
                    case 1:return "LXXX";
                    case 2:return "DCCC";
                }
            case 9:
                switch (digitIndex){
                    case 0:return "IX";
                    case 1:return "XC";
                    case 2:return "CM";
                }
        }
        return "";
    }
}
