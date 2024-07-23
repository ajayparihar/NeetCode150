public class ReverseLinkedList_Iterative {
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
        LinkedListHelper.ListNode previous = null;
        LinkedListHelper.ListNode current = head;
        LinkedListHelper.ListNode nextOfCurrent = null;

        while (current != null) {
            nextOfCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextOfCurrent;
        }
        return previous;
    }
}
