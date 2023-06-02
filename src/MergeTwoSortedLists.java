public class MergeTwoSortedLists {

    //    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalListNode = new ListNode(0);
        ListNode currentNode = finalListNode;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                currentNode.next = new ListNode(list2.val);
                currentNode = currentNode.next;
                list2 = list2.next;
                continue;
            }
            if (list2 == null) {
                currentNode.next     = new ListNode(list1.val);
                currentNode = currentNode.next;
                list1 = list1.next;
                continue;
            }
            if (list2.val < list1.val) {
                currentNode.next = new ListNode(list2.val);
                currentNode = currentNode.next;
                list2 = list2.next;
            } else {
                currentNode.next = new ListNode(list1.val);
                currentNode = currentNode.next;
                list1 = list1.next;
            }

        }
        return finalListNode.next;
    }

    public static void main(String[] args) {

    }
}
