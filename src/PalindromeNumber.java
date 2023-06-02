public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0;
        int forward = x;
        while (forward != 0){
            reverse = reverse * 10 + forward % 10;
            forward = forward / 10;
        }
        return reverse == x;

    }

}
