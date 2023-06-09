public class GreatestCommonDivisorofStrings {
    public String gcdOfStrings1(String str1, String str2) {
        String minString = str2;
        String maxString = str2;
        if (str1.compareTo(str2) < 0) {
            minString = str1;
        } else {
            maxString = str1;
        }
        int max = maxString.length();
        int min = minString.length();
        int r = GCD(min, max);
        for (int i = 0; i < max; i += r) {
            if (!(minString.substring(0, r).equals(maxString.substring(i, i + r)))) {
                return "";
            }
        }
        for (int i = 0; i < min; i += r) {
            if (!(maxString.substring(0, r).equals(minString.substring(i, i + r)))) {
                return "";
            }
        }

        return minString.substring(0, r);
    }

    private int GCD(int min, int max) {
        while (min > 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0, GCD(str1.length(), str2.length()));
    }

    public static void main(String[] args) {
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("ABCABC", "ABC"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("LEET", "CODE"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("LEET", "LEET"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("ABAABA", "ABA"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("ABCDEF", "ABC"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("TT", "TTTT"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("T", "TTTT"));
        System.out.println(new GreatestCommonDivisorofStrings().gcdOfStrings("TT", "TTTT"));
    }
}
