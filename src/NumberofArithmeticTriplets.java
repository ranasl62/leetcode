
public class NumberofArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int valueJ, valueK;
        for (int i = 0; i < nums.length - 1; i++) {
            valueJ = binarySearch(nums, i + 1, nums.length - 1, nums[i] + diff);
            valueK = binarySearch(nums, i + 1, nums.length - 1, nums[i] + 2 * diff);
            if (valueJ != -1 && valueK != -1 && valueK > valueJ) {
                count++;
            }
        }
        return count;
    }

    private int binarySearch(int[] nums, int start, int end, int key) {

        int mid;
        while (start <= end) {
            mid = (start + end) >> 1;
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new NumberofArithmeticTriplets().arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        System.out.println(new NumberofArithmeticTriplets().arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
        System.out.println(new NumberofArithmeticTriplets().arithmeticTriplets(new int[]{4, 6, 8, 10, 12, 14}, 2));
        System.out.println(new NumberofArithmeticTriplets().arithmeticTriplets(new int[]{5, 6, 7, 8, 8, 9}, 1));
    }
}
