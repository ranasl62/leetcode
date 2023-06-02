public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = n + m - 1;
        for (int x = k; x >= 0; x--) {
            if (j < 0) break;
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[x] = nums1[i--];
            } else {
                nums1[x] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,0};
        int[] nums2 = new int[]{-1};
        int n = 1, m = 1;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        for (int i = 0; i < n + m; i++) {
            System.out.println(nums1[i]);
        }
    }
}
