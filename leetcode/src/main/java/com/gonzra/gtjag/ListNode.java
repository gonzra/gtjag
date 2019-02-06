package com.gonzra.gtjag;

import java.util.Objects;

/*
Simple implementation of a Singly Linked List node. Just to help with the Leetcode problems
 */
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }

    public static ListNode createList(int ... nums) {
        ListNode head = new ListNode(-999);
        ListNode curr = head;
        for (int num : nums) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return head.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
