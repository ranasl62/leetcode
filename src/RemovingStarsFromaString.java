public class RemovingStarsFromaString {
    public String removeStars(String s) {
        int countStar = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == '*') countStar++;

        if (s.length() - countStar * 2 == 0) return "";
        char[] chars = new char[s.length() - countStar * 2];
        int j = chars.length - 1;
        countStar = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                countStar++;
            } else {
                if (countStar == 0) {
                    chars[j--] = s.charAt(i);
                } else {
                    countStar--;
                }

            }

        }
        return new String(chars);
    }

    public static void main(String[] args) {

    }
}
