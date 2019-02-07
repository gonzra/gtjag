package com.gonzra.gtjag.algo.linkedlists;

import com.gonzra.gtjag.ds.ListNode;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
 */
public class AddTwoNumbers {

    /*
    Questions and Assumptions
    - Could the lists be empty or null?
    Lets assume that nums cannot be null or empty.
    - Does each node contain a sigle digit?
    Yes
    - Assume that the input lists contain no leading 0 other than the number 0 itself.

     Example:
     Input:
        l1: 2 -> 4 -> 3
        l2: 5 -> 6 -> 4

     Output:
        7 -> 0 -> 8
        Since 342 + 465 = 807.
     */

    public ListNode addTwoNumers(ListNode l1, ListNode l2){
        ListNode result = new ListNode(-999);
        ListNode currDigit = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int l1CurrValue = l1 == null ? 0 : l1.getVal();
            int l2CurrValue = l2 == null ? 0 : l2.getVal();

            int value = l1CurrValue + l2CurrValue + carry;
            carry = value/10;
            currDigit.setNext(new ListNode(value%10));

            if (l1 != null) {
              l1 = l1.getNext();
            }

            if (l2 != null) {
                l2 = l2.getNext();
            }

            currDigit = currDigit.getNext();
        }

        if (carry == 1){
            currDigit.setNext(new ListNode(1));
        }

        return result.getNext();
    }

    public ListNode addTwoNumers2(ListNode l1, ListNode l2){
        ListNode result = new ListNode(-999);
        ListNode currDigit = result;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int value = l1.getVal() + l2.getVal() + carry;
            carry = value/10;
            currDigit.setNext(new ListNode(value%10));

            l1 = l1.getNext();
            l2 = l2.getNext();
            currDigit = currDigit.getNext();
        }

        while (l1 != null) {
            int value = l1.getVal() + carry;
            carry = value/10;
            currDigit.setNext(new ListNode(value%10));
            l1 = l1.getNext();
            currDigit = currDigit.getNext();
        }

        while (l2 != null) {
            int value = l2.getVal() + carry;
            carry = value/10;
            currDigit.setNext(new ListNode(value%10));
            l2 = l2.getNext();
            currDigit = currDigit.getNext();
        }

        if (carry == 1){
            currDigit.setNext(new ListNode(1));
        }

        return result.getNext();
    }
}
