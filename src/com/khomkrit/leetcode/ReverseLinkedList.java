package com.khomkrit.leetcode;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return this.val + " -> " + this.next;
    }
}

// Given the head of a singly linked list, reverse the list, and return the reversed list.
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println("head: " + head.toString());
        System.out.println("reverse: " + reverseList(head).toString());
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        // 1 -> 2 -> 3 -> null
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            // next = 2 | next = 3 | next = null
            next = curr.next;
            // curr.next = null | curr.next = 1 | curr.next = 2
            curr.next = prev;
            // prev = 1 | prev = 2 | prev = 3 -> 2 -> 1 -> null
            prev = curr;
            // curr = 2 | curr = 3 | curr = null
            curr = next;
        }
        return prev;
    }

    public static ListNode recursivelyReverse(ListNode head) {
        // base case: return when hit the last node
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedListHead = recursivelyReverse(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListHead;
    }
}
