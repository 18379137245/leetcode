package algorithm10_06_31.day_10_31.剑指Offer24;

import java.util.Stack;

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

    public static ListNode reverseList(ListNode head) {

        ListNode pre = head, cur = null;
        while (pre != null) {
            //获取当前元素下的所有链表元素
            ListNode next = pre.next;
            //把当前元素链表下设为null表示没有元素没有下一个元素 第一次
            //当前元素，null  1，null
            //把当前元素链表下设为新的元素链表的元素 第2次
            //当前元素,新的元素链表的原有元素 2,1，null
            //n,2,1,null 第n次
            pre.next = cur;
            //把当前元素链表给新的元素链表
            cur = pre;
            //重新获取开始拿到的所有链表元素
            pre = next;
        }
        return cur;
    }

    public static void main(String[] args) {
        Solution in = new Solution();
        in.put(1);
        in.put(2);
        in.put(3);
        in.put(4);
        in.put(5);
        System.out.println(reverseList(in.head));

    }
}