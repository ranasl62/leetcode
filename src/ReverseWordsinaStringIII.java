public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append(reverseString(temp.toString())).append(" ");
                temp = new StringBuilder();
            } else {
                temp.append(s.charAt(i));
            }
        }
        str.append(reverseString(temp.toString()));
        return str.toString();
    }

    private String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            stringBuilder.setCharAt(start, str.charAt(end));
            stringBuilder.setCharAt(end, str.charAt(start));
            start++;
            end--;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsinaStringIII().reverseWords("Let's take LeetCode contest").equals("s'teL ekat edoCteeL tsetnoc"));
        System.out.println(new ReverseWordsinaStringIII().reverseWords("God Ding").equals("doG gniD"));
        System.out.println(new ReverseWordsinaStringIII().reverseWords("a b").equals("a b"));
    }
}
