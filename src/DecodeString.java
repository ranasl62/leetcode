import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        int k = 0;
        StringBuilder nums = new StringBuilder();
        boolean openB = false, closeB = false;
        Stack<Character> stack = new Stack<>();
        StringBuilder finalS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            stack.push(currentChar);
            if (currentChar == ']') {
                while (!stack.isEmpty()) {
                    char c = stack.pop();
                    if (c == ']' && !closeB) {
                        closeB = true;
                        continue;
                    }
                    if (c == '[' && !openB) {
                        openB = true;
                        continue;
                    }
                    if (openB && closeB) {
                        if (Character.isDigit(c)) {
                            nums.append(c);
                        } else {
                            stack.push(c);
                            break;
                        }
                    } else {
                        finalS.append(c);
                    }
                }
                k = Integer.parseInt(nums.reverse().toString());
                StringBuilder temp = new StringBuilder();
                temp.append(String.valueOf(finalS.reverse()).repeat(Math.max(0, k)));
                for (char t : temp.toString().toCharArray()) {
                    stack.push(t);
                }
                openB = false;
                closeB = false;
                finalS = new StringBuilder();
                nums = new StringBuilder();
            }
        }
        finalS = new StringBuilder();
        while (!stack.isEmpty()) {
            finalS.append(stack.pop());
        }
        return finalS.reverse().toString();
    }

    public static void main(String[] args) {
//        System.out.println(new DecodeString().decodeString("2[abc]3[cd]ef"));
//        System.out.println(new DecodeString().decodeString("3[a2[c]]"));
//        System.out.println(new DecodeString().decodeString("3[a]2[bc]"));
//        System.out.println(new DecodeString().decodeString("1[2[3[abc]]]"));
//        System.out.println(new DecodeString().decodeString("[[[[1[2[3[abc]]]]]]]"));
        System.out.println(new DecodeString().decodeString("100[leetcode]"));
    }
}
