public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(new RemoveElement().removeElement(nums,2));
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}