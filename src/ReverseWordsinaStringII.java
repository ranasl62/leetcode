public class ReverseWordsinaStringII {

    public void reverseWords(char[] s) {
        int n = s.length;

        reverse(s, 0, n);

        int start = 0;
        int end = 0;

        for (end = 0; end < n; end++) {
            if (s[end] == ' ') {
                reverse(s, start, end);
                System.out.println(start + " " + end);
                start = ++end;
            }
        }
    }

    public void reverse(char[] s, int star, int end) {
        int n = (end - star) / 2;
        for (int i = 0; i < n; i++) {
            char temp = s[i];
            s[i] = s[end - i - 1];
            s[end - i - 1] = temp;
        }
    }
}
