package com.gonzra.gtjag.algo.linkedlists;

import com.gonzra.gtjag.ds.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class AddTwoNumbersTest {

    @Test
    public void l1Zero(){
        ListNode l1 = ListNode.createList(0);
        ListNode l2 = ListNode.createList(1, 2, 3);

        ListNode expected = ListNode.createList(1, 2, 3);
        ListNode actual = test(l1, l2);
        Assert.assertThat(expected, is(actual));
    }

    @Test
    public void simple(){
        ListNode l1 = ListNode.createList(2, 4, 3);
        ListNode l2 = ListNode.createList(5, 6, 4);

        ListNode expected = ListNode.createList(7, 0, 8);
        ListNode actual = test(l1, l2);
        Assert.assertThat(expected, is(actual));
    }

    @Test
    public void withCarry(){
        ListNode l1 = ListNode.createList(2, 4, 3);
        ListNode l2 = ListNode.createList(5, 6, 6);

        ListNode expected = ListNode.createList(7, 0, 0, 1);
        ListNode actual = test(l1, l2);
        Assert.assertThat(expected, is(actual));
    }

    @Test
    public void withCarry2(){
        ListNode l1 = ListNode.createList(2, 4, 3);
        ListNode l2 = ListNode.createList(5, 6, 4, 1);

        ListNode expected = ListNode.createList(7, 0, 8, 1);
        ListNode actual = test(l1, l2);
        Assert.assertThat(expected, is(actual));
    }

    @Test
    public void withCarry3(){
        ListNode l1 = ListNode.createList(2, 4, 3);
        ListNode l2 = ListNode.createList(5, 6, 6, 9, 1);

        ListNode expected = ListNode.createList(7, 0, 0, 0, 2);
        ListNode actual = test(l1, l2);
        Assert.assertThat(expected, is(actual));
    }

    private ListNode test(ListNode l1, ListNode l2){
        AddTwoNumbers addTwoNumbersInstance = new AddTwoNumbers();
        return addTwoNumbersInstance.addTwoNumers2(l1, l2);
    }
}
