package algorithm10_06_31.day_10_24.剑指Offer06;

import jdk.nashorn.internal.objects.annotations.Where;

import java.util.Arrays;
import java.util.Stack;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_24.剑指Offer06
 * @className: 从尾到头打印链表
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/24 20:41
 * @version: 1.0
 */

public class 从尾到头打印链表 {
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

//    public void printLink(ListNode node) {
//        if (node == null) {
//            return;
//        } else {
//            curren = node;
//            while (curren != null) {
//                System.out.println(curren.val);
//                curren = curren.next;
//            }
//        }
//    }

    public static int[] reversPrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }

    public static void main(String[] args) {
        从尾到头打印链表 in = new 从尾到头打印链表();
        in.put(2);
        in.put(1);
        in.put(3);
        int[] ints = reversPrint(in.head);
        System.out.println(Arrays.toString(ints));
    }

}
