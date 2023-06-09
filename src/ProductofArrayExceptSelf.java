import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int pPre = 1;
        int pSuf = 1;
        int zeroCount = nums[0] == 0 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                continue;
            }
            pSuf *= nums[i];
        }

        if (zeroCount > 1) return answer;
        if (zeroCount == 1) {
            pSuf *= nums[0] == 0 ? 1 : nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    answer[i] = pSuf;
                }
            }
            return answer;
        }
        pPre = nums[0];
        answer[0] = pSuf;
        for (int i = 1; i < nums.length; i++) {

            pSuf /= nums[i];
            answer[i] = pPre * pSuf;
            pPre *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductofArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(new ProductofArrayExceptSelf().productExceptSelf(new int[]{0,1,1,1,0})));
        System.out.println(Arrays.toString(new ProductofArrayExceptSelf().productExceptSelf(new int[]{2,2,2,2,2})));
    }
}
