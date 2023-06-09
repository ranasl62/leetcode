import java.util.Arrays;

public class MergeTwo2DArraysbySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int max = 0;
        for (int[] ints : nums1) {
            max = Math.max(ints[0], max);
        }
        for (int[] ints : nums2) {
            max = Math.max(ints[0], max);
        }
        int[] sum = new int[max + 1];
        int count = 0;
        for (int[] ints : nums1) {
            if (sum[ints[0]] == 0) count++;
            sum[ints[0]] += ints[1];
        }
        for (int[] ints : nums2) {
            if (sum[ints[0]] == 0) count++;
            sum[ints[0]] += ints[1];
        }
        int[][] nums = new int[count][2];
        count -= 1;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (sum[i] != 0) {
                nums[count][0] = i;
                nums[count][1] = sum[i];
                count--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new MergeTwo2DArraysbySummingValues().mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}})));
    }
}