package algorithm11_01_30.day_11_30.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_30.leetcode
 * @className: 删除链表中的节点
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/30 19:05
 * @version: 1.0
 */

public class 删除链表中的节点 {

    ListNode head = null;
    ListNode curren = null;
    public static void main(String[] args) {

    }

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

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
