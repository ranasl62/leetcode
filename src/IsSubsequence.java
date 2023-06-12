public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if(t.length() < s.length()) return false;
        if(s.length() == j) return true;
        for (int i = 0; i < t.length(); i++) {
            if (s.length() > j && t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        return s.length() <= j;
    }
}
