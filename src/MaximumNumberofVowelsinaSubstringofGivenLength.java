public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public int maxVowels(String s, int k) {
        int count = 0, max = 0;
        char currentChar;
        for (int i = 0; i < k; i++) {
            currentChar = s.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }
        max = Math.max(max,count);
        for (int i = k; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
            currentChar = s.charAt(i - k);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count--;
            }
            max = Math.max(max,count);

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumNumberofVowelsinaSubstringofGivenLength().maxVowels("abciiidef", 3));
        System.out.println(new MaximumNumberofVowelsinaSubstringofGivenLength().maxVowels("aeiou", 2));
        System.out.println(new MaximumNumberofVowelsinaSubstringofGivenLength().maxVowels("leetcode", 3));
        System.out.println(new MaximumNumberofVowelsinaSubstringofGivenLength().maxVowels("weallloveyou", 7));
    }
}
