public class FindFirstPalindromicStringintheArray {
    public String firstPalindrome(String[] words) {

        for (String word : words) {
            if (isPalindromic(word)) return word;
        }
        return "";
    }

    private boolean isPalindromic(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start <= end) {
            if (word.charAt(start) != word.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new FindFirstPalindromicStringintheArray().firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}).equals("ada"));
        System.out.println(new FindFirstPalindromicStringintheArray().firstPalindrome(new String[]{"notapalindrome","racecar"}).equals("racecar"));
    }
}
