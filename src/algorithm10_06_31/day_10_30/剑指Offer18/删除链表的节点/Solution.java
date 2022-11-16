package algorithm10_06_31.day_10_30.剑指Offer18.删除链表的节点;

import algorithm10_06_31.day_10_24.剑指Offer06.从尾到头打印链表;

import java.util.Arrays;

class Solution {

    ListNode head = null;
    ListNode curren = null;

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void put(int data) {
        if (head == null) {
            head = new ListNode(data);
            curren = head;
        } else {
            curren.next = new ListNode(data);
            curren = curren.next;
        }
    }

    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) pre.next = cur.next;
        return head;
    }

    public static void main(String[] args) {
        Solution in = new Solution();
        in.put(4);
        in.put(5);
        in.put(1);
        in.put(9);
        System.out.println(deleteNode(in.head, 4));

    }
}