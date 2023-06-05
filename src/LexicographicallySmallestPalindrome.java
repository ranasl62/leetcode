public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == s.charAt(n - 1 - i)) {
                continue;
            }
            if (s.charAt(i) < s.charAt(n - 1 - i)) {
                str.setCharAt(n - i - 1, s.charAt(i));
            } else {
                str.setCharAt(i, s.charAt(n - i - 1));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LexicographicallySmallestPalindrome().makeSmallestPalindrome("egcfe"));
        System.out.println(new LexicographicallySmallestPalindrome().makeSmallestPalindrome("abcd"));
    }
}
