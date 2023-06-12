public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        int i = 1;
        int end = k;
        double current = sum;
        while (end < nums.length) {
            current = current + nums[end] - nums[i - 1];
            if (sum < current) {
                sum = current;
            }
            i++;
            end++;
        }
        return sum / k;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3, 51}, 4));
    }
}
