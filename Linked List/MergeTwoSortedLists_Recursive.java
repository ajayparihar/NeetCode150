public class MergeTwoSortedLists_Recursive {
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
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
}