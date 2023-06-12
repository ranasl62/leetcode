public class LongestSubarrayof1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int zeroCount, left, right, maxWindow;

        for (zeroCount = left = right = maxWindow = 0; right < nums.length; right++) {

            if (nums[right] == 0) zeroCount++;

            while (zeroCount > 1) {
                zeroCount -= 1 - nums[left];
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left);
        }
        return maxWindow;

    }

    public static void main(String[] args) {
        System.out.println(new LongestSubarrayof1sAfterDeletingOneElement().longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    }
}
