public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = longestPalindromeLen(s, i, i);
            int len2 = longestPalindromeLen(s, i, i + 1);
            if (maxLength < Math.max(len1, len2)) {
                maxLength = Math.max(len1, len2);
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int longestPalindromeLen(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;

    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("abbbba"));
    }
}
