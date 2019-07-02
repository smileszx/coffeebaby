package com.coffee.baby.listnode;

/**
 * @Description
 *
 * 判斷鏈錶是否有環
 * @Author Thinkpad
 * @Date 2019/7/2 22:28
 **/
public class CycleListNode {

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 1;
        ListNode node2 = new ListNode();
        node2.val = 2;
        ListNode node3 = new ListNode();
        node3.val = 3;
        ListNode node4 = new ListNode();
        node4.val = 4;

        ListNode head = new ListNode();
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(head);
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle (ListNode head) {
        ListNode slow = head;

        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //相遇點
                System.out.println(slow.val + ", " + fast.val);
                return true;
            }
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;
    }
}
