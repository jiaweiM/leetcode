package leetcode;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 27 Aug 2020, 7:48 PM
 */
public class P2
{
    static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode root = new ListNode(-1);
        ListNode current = root;
        int value = 0;
        while (l1 != null || l2 != null || value != 0) {
            if (l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(value % 10);
            current = current.next;
            value /= 10;
        }
        return root.next;
    }

    public static void main(String[] args)
    {
        ListNode node = new ListNode(5);
//        node.next = new ListNode(4);
//        node.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
//        node2.next = new ListNode(6);
//        node2.next.next = new ListNode(4);

        ListNode node1 = addTwoNumbers(node, node2);
        while (node1 != null) {
            System.out.println(node1.val);
            node1 = node1.next;
        }

    }
}
