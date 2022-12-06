package algorithm12_01_31.day_12_05.leetcode.环形链表;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode L2 = new ListNode(2);
        L2.next = new ListNode(0);
        L2.next.next = new ListNode(4);

        ListNode L1 = new ListNode(3);
        L1.next = new ListNode(2);
        L1.next.next = new ListNode(0);
        L1.next.next.next = new ListNode(4);
        L1.next.next.next.next = new ListNode(L2.val);
        L1.next.next.next.next.next = new ListNode(L2.next.val);
        L1.next.next.next.next.next.next = new ListNode(L2.next.next.val);
        L1.next.next.next.next.next.next.next = new ListNode(L2.val);
        L1.next.next.next.next.next.next.next.next = new ListNode(L2.next.val);
        L1.next.next.next.next.next.next.next.next.next = new ListNode(L2.next.next.val);
        System.out.println(hasCycle(L1));
    }

}