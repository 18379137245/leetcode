package algorithm11_01_30.day_11_01.剑指Offer25.合并两个排序的链表;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class offer25 {
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //l1链表等于null直接返回l2链表
        if (l1 == null) {
            return l2;
        } else if (l2 == null) { //l2链表等于null直接返回l1链表
            return l1;

        } else if (l1.val < l2.val) { //链表1当前元素的值小于链表2当前元素的值的值
            //就接上自己的后面元素的值
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            //链表1当前元素的值大于等于链表2当前元素的值的值
            //链表2就接上自己的后面元素的值
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        ListNode res = mergeTwoLists(l1, a1);
        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }
}