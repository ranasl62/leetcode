public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count++] = nums[i];
            }
        }
//        Arrays.stream(nums).forEach(System.out::println);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 1, 1, 1, 2}));
    }
}
