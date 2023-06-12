import java.util.Arrays;

public class MaxNumberofKSumPairsMedium {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int start = 0;
        int end = nums.length - 1;
        while (end > start) {
            if (nums[end] + nums[start] == k) {
                count++;
                end--;
                start++;
            } else if (nums[end] + nums[start] > k) {
                end--;
            } else {
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MaxNumberofKSumPairsMedium().maxOperations(new int[]{1, 2, 3, 4}, 5));
    }

}
