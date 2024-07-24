public class MergeTwoSortedLists_Iterative {
    public static void main(String[] args) {
        LinkedListHelper.ListNode list1 = new LinkedListHelper.ListNode(1);
        list1.next = new LinkedListHelper.ListNode(2);
        list1.next.next = new LinkedListHelper.ListNode(4);

        LinkedListHelper.ListNode list2 = new LinkedListHelper.ListNode(1);
        list2.next = new LinkedListHelper.ListNode(3);
        list2.next.next = new LinkedListHelper.ListNode(4);

        LinkedListHelper.ListNode mergedList = mergeTwoLists(list1, list2);

        LinkedListHelper.printList(mergedList);
    }

    static LinkedListHelper.ListNode mergeTwoLists(LinkedListHelper.ListNode list1, LinkedListHelper.ListNode list2) {
        final LinkedListHelper.ListNode dummyRoot = new LinkedListHelper.ListNode(0);
        LinkedListHelper.ListNode current = dummyRoot;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;

        return dummyRoot.next;
    }
}
