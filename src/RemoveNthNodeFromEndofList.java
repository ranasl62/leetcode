public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }

        current = head;
        count = count - n;
        while (count != 0) {
            current = current.next;
            count--;
        }
        current.next = current.next.next;
        return head;

    }

    public static void main(String[] args) {

    }
}
