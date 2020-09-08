package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 27 Aug 2020, 9:21 PM
 */
public class P4
{
    static class ListNode
    {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists2(ListNode[] lists)
    {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, Comparator.comparingInt(o -> o.val));
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode node : lists) {
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) queue.add(p.next);
        }
        return dummy.next;
    }


    public static ListNode mergeKLists(ListNode[] lists)
    {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1)
            return lists[0];
        if (lists.length == 2)
            return mergeTwoList(lists[0], lists[1]);
        int mid = lists.length / 2;
        ListNode[] l1 = new ListNode[mid];
        System.arraycopy(lists, 0, l1, 0, mid);

        ListNode[] l2 = new ListNode[lists.length - mid];
        if (lists.length - mid >= 0)
            System.arraycopy(lists, mid, l2, mid, lists.length - mid);

        return mergeTwoList(mergeKLists(l1), mergeKLists(l2));
    }

    private static ListNode mergeTwoList(ListNode l1, ListNode l2)
    {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode head;
        if (l1.val <= l2.val) {
            head = l1;
            head.next = mergeTwoList(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoList(l1, l2.next);
        }
        return head;
    }


    public static void main(String[] args)
    {

    }
}
