package com.leetcode.quests;

import java.util.Iterator;
import java.util.List;

/**
 * 341. 扁平化嵌套列表迭代器
 */
public class Q341 {
}

/**
 *  This is the interface that allows for creating nested lists.
 *  You should not implement it, or speculate about its implementation.
 */
interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    List<NestedInteger> getList();
}

class NestedIterator implements Iterator<Integer> {

    public NestedIterator(List<NestedInteger> nestedList) {

    }

    @Override
    public Integer next() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
