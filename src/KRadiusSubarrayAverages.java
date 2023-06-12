import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int totalElement = 2 * k + 1;
        if (k == 0) return nums;
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        if (nums.length < totalElement) {
            return result;
        }


        long sum = 0;
        for (int i = 0; i < totalElement; i++) sum += nums[i];
        int start = 1;
        int end = totalElement;
        result[k] = (int) (sum / totalElement);
        while (end < nums.length) {
            sum = sum + nums[end] - nums[start - 1];
            result[++k] = (int) (sum / totalElement);
            end++;
            start++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new KRadiusSubarrayAverages().getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)));
    }
}

