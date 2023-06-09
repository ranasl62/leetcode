public class ReverseWordsinaString {
    public String reverseWords(String s) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        while (i < s.length()) {
            if (s.charAt(i) == ' ' && temp.length() > 0) {
                if (str.length() > 0)
                    str.insert(0, " ");
                str.insert(0, temp);
                temp = new StringBuilder();
            }

            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            }
            i++;
        }
        if (temp.length() > 0) {
            if (str.length() > 0) {
                str.insert(0, " ");
            }
            str.insert(0, temp);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsinaString().reverseWords("the sky is blue"));
        System.out.println(new ReverseWordsinaString().reverseWords("         the          sky  is      blue "));
        System.out.println(new ReverseWordsinaString().reverseWords("t"));
    }
}
