public class DIStringMatch {
    public int[] diStringMatch(String s) {

        int[] arr = new int[s.length() + 1];
        int I = 0;
        int D = arr[0] = s.length();
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) == 'I' ? I++ : D--;
        }
        if (s.charAt(s.length() - 1) == 'I') arr[arr.length - 1] = I;
        else arr[arr.length - 1] = D;
        return arr;
    }
}
