import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length && i < nums.length) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            while (j < nums.length && nums[j] == 0) j++;
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortArrayByParity().sortArrayByParity(new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(new SortArrayByParity().sortArrayByParity(new int[]{3, 1, 3, 4})));
        System.out.println(Arrays.toString(new SortArrayByParity().sortArrayByParity(new int[]{1111,2})));
    }
}
