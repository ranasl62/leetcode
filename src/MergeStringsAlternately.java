public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder str = new StringBuilder();
        int x = 0, y = 0;
        int xLen = word1.length();
        int yLen = word2.length();
        while (x < xLen || y < yLen) {
            if (x < xLen) {
                str.append(word1.charAt(x++));
            }
            if (y < yLen) {
                str.append(word2.charAt(y++));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new MergeStringsAlternately().mergeAlternately("abc","pqr").equals("apbqcr"));
        System.out.println(new MergeStringsAlternately().mergeAlternately("ab","pqrs").equals("apbqrs"));
        System.out.println(new MergeStringsAlternately().mergeAlternately("abcd","pq").equals("apbqcd"));
        System.out.println(new MergeStringsAlternately().mergeAlternately("","pq").equals("pq"));
    }
}