import java.util.Arrays;

public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char cS = s.charAt(start);
            char cE = s.charAt(end);
            if (isVowel(cS) && isVowel(cE)) {
                swapChar(chars, start++, end--);
            }
            if (!isVowel(cE)) end--;
            if (!isVowel(cS)) start++;

        }
        return new String(chars);
    }

    private void swapChar(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
}
