public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int start = 0;
        int end = n - 1;
        int area = 0;
        while (start < end) {
            area = Math.min(height[start], height[end]) * (end - start);
            if (max < area) {
                max = area;
            }
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
//            }
//        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 1}));
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 1, 1, 2, 4}));
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{9, 9, 9, 9, 9}));
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{0,2}));
    }
}
