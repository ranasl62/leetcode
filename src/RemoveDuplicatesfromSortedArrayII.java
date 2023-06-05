public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int current = nums[0], count = 1, k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == current) {
                count++;
            } else {
                current = nums[i];
                count = 1;
            }
            if(count <= 2){
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arra1 = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(new RemoveDuplicatesfromSortedArrayII().removeDuplicates(arra1));
        int[] arra2 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(new RemoveDuplicatesfromSortedArrayII().removeDuplicates(arra2));

        int[] arra3 = new int[]{1,2,3,4,5,6,7};
        System.out.println(new RemoveDuplicatesfromSortedArrayII().removeDuplicates(arra3));

        int[] arra4 = new int[]{1,1,1,1,1,1,1,1,1,1};
        System.out.println(new RemoveDuplicatesfromSortedArrayII().removeDuplicates(arra4));
        for (int i = 0; i < arra4.length; i++) {
            System.out.println(arra4[i]);
        }
    }
}
