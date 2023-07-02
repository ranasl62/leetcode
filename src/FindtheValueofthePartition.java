import java.util.Arrays;

public class FindtheValueofthePartition {
    public static void main(String[] args) {
        System.out.println(new FindtheValueofthePartition().findValueOfPartition(new int[]{100, 1, 90, 89}));
        System.out.println(new FindtheValueofthePartition().findValueOfPartition(new int[]{1, 3, 2, 4}));
    }

    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            min = Math.min(min, Math.abs(nums[i] - nums[i + 1]));
        }
        return min;
    }
}
