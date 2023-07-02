public class DeleteNNodesAfterMNodesofaLinkedList {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode listNode = null;
        ListNode currentNode = head;
        while (head.next != null) {

            for (int i = 0; i < m; i++) {
                if (listNode == null) {
                    listNode = new ListNode(head.val);
                } else {
                    listNode.next = new ListNode(head.val);
                    listNode = listNode.next;
                }
                if (head.next == null) return listNode;
                else head = head.next;
            }

            for (int i = 0; i < n; i++) {
                if (head.next != null) head = head.next;
                else return listNode;
            }

        }
        return listNode;
    }

}
