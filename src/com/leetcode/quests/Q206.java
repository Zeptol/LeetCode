package com.leetcode.quests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 206. 反转链表
 * 反转一个单链表。
 */
public class Q206 {

    public static void main(String[] args) {
//        var head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        Integer[] nums = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));
        //Collections.addAll(list,nums);
        //Arrays.stream(nums).forEach(list::add);
        ListNode head = initNode(list);
        head = reverseList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    //    private static ListNode reverseNode(int[] nums) {
//        var transferredList = new ArrayList<Integer>();
//        Arrays.stream(nums).forEach(transferredList::add);
//        var node = new ListNode(transferredList.get(0));
//        while (!transferredList.isEmpty()) {
//            node.val = transferredList.get(0);
//            node.next = node;
//            transferredList.remove(0);
//        }
//        return node;
//    }
    private static ListNode initNode(List<Integer> nums) {
        if (nums.isEmpty()) return null;
        var node = new ListNode(nums.get(0));
        nums.remove(0);
        node.next = initNode(nums);
        return node;
    }

    //    public static ListNode reverseList(ListNode head) {
//        var list = new ArrayList<Integer>();
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//        Collections.reverse(list);
//
//        return initNode(list);
//    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }
        return prev;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
