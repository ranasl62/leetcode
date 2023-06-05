public class ReversePrefixofWord {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                k = i;
                break;
            }
        }
        for (int i = 0; i <= k / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[k - i];
            chars[k - i] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new ReversePrefixofWord().reversePrefix("abcdefd", 'd').equals("dcbaefd"));
        System.out.println(new ReversePrefixofWord().reversePrefix("abcdef", 'd').equals("dcbaef"));
    }
}
