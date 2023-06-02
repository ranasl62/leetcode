public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        if (haystack.startsWith(needle)) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i).startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FindtheIndexoftheFirstOccurrenceinaString().strStr("abc", "c"));
    }
}
