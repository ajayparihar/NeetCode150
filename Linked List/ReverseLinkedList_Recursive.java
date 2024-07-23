import java.lang.classfile.components.ClassPrinter.ListNode;

public class ReverseLinkedList_Recursive {
    public static void main(String[] args) {

        LinkedListHelper.ListNode head = new LinkedListHelper.ListNode(1);
        head.next = new LinkedListHelper.ListNode(2);
        head.next.next = new LinkedListHelper.ListNode(3);
        head.next.next.next = new LinkedListHelper.ListNode(4);
        head.next.next.next.next = new LinkedListHelper.ListNode(5);

        LinkedListHelper.ListNode reversedHead = reverseList(head);
        LinkedListHelper.printList(reversedHead);
    }

    public static LinkedListHelper.ListNode reverseList(LinkedListHelper.ListNode head) {
        return reverse(head, null);
    }

    static LinkedListHelper.ListNode reverse(LinkedListHelper.ListNode node, LinkedListHelper.ListNode pre) {
        if (node == null)
            return pre;

        LinkedListHelper.ListNode temp = node.next;
        node.next = pre;
        return reverse(temp, node);
    }
}
