package algorithm12_01_31.day_12_05.leetcode;


public class test2_HeBingLianBiao {
    public static void main(String[] args) {
        Solution6.ListNode L1 = new Solution6.ListNode(1);
        L1.next =  new Solution6.ListNode(2);
        L1.next.next = new Solution6.ListNode(4);
        L1.next.next.next = new Solution6.ListNode();

        Solution6.ListNode L2 = new Solution6.ListNode(1);
        L2.next = new Solution6.ListNode(3);
        L2.next.next = new Solution6.ListNode(4);
        L2.next.next.next = new Solution6.ListNode();

        Solution6 solution6 = new Solution6();
        Solution6.ListNode listNode = solution6.mergeTwoLists(L1, L2);
    }
}