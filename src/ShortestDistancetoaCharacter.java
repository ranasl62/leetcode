import java.util.Arrays;

public class ShortestDistancetoaCharacter {
    public int[] shortestToChar(String s, char c) {
        int cIndex = 0;
        int cIndex2;
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                cIndex = i;
                result[i] = 0;
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result[i] = 0;
                cIndex = cIndex2 = i;
                while (--cIndex2 >= 0 && result[cIndex2] != 0)
                    result[cIndex2] = Math.min(i - cIndex2, result[cIndex2]);
            } else {
                result[i] = Math.abs(cIndex - i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShortestDistancetoaCharacter().shortestToChar("eeeeee1eeeeeeeeeeeee", 'e')));
    }
}
