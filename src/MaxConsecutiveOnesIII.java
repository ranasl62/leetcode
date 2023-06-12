public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {

            if (nums[right] == 0) k--;

            if (k < 0) k += 1 - nums[left++];

        }
        return right - left;
    }

}
