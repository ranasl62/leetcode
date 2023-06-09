public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {

        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return 2;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new RemovePalindromicSubsequences().removePalindromeSub("ababa"));
        System.out.println(new RemovePalindromicSubsequences().removePalindromeSub("abb"));
        System.out.println(new RemovePalindromicSubsequences().removePalindromeSub("baabb"));
    }
}
