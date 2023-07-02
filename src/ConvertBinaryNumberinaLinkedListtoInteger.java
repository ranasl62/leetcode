public class ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {

        int result = 0;
        while (head != null) {
            result *= 2 + head.val;
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
