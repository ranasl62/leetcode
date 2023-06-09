import java.util.Arrays;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            int left = 0;
            int right = n - 1;

            for (int i = n - 1; i >= 0; i--) {
                int square;
                if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                    square = nums[right];
                    right--;
                } else {
                    square = nums[left];
                    left++;
                }
                result[i] = square * square;
            }
            return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(new int[]{-4, -1, -1, 0, 3, 3, 10})));
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(new int[]{-4, -1, 0})));
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(new int[]{-4, -1})));
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(new int[]{-4})));
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(new int[]{-5, -3, -2, -1})));
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(new int[]{1, 2, 3, 4, 5})));
    }
}
