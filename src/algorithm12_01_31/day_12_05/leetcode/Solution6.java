package algorithm12_01_31.day_12_05.leetcode;


class Solution6 {
    public static class ListNode {
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
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            System.out.println("l1的值小，摘出l1");
            System.out.println("l1.val = " + l1.val);
            l1.next = mergeTwoLists(l1.next, l2);
            System.out.println("l1.val = " + l1.val);
            return l1;
        } else {
            System.out.println("l2的值小，摘出l2");
            System.out.println("l2.val = " + l2.val);
            l2.next = mergeTwoLists(l1, l2.next);
            System.out.println("l2.val = " + l2.val);
            return l2;
        }

    }
}