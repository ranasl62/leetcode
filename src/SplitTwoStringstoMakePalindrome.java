public class SplitTwoStringstoMakePalindrome {
    public boolean checkPalindromeFormation(String a, String b) {
        return validatePalindrome(a, b) || validatePalindrome(b, a);
    }

    private boolean validatePalindrome(String a, String b) {
        int left = 0;
        int right = a.length() - 1;

        while (left < right && a.charAt(left) == b.charAt(right)) {
            left++;
            right--;
        }
        return isPalindrome(a, left, right) || isPalindrome(b, left, right);
    }

    private boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new SplitTwoStringstoMakePalindrome().checkPalindromeFormation("ulacfd", "jizalu"));

    }
}
