import java.util.Arrays;

public class SpecialPermutations {
    public static int specialPerm(int[] nums) {
        int n = nums.length;
        int MOD = (int) (1e9 + 7);

        Arrays.sort(nums);
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
                if (nums[j] % nums[i] == 0) {
                    dp[j] = (dp[j] + dp[i]) % MOD;
                }
            }
        }

        int totalSpecialPermutations = dp[n-1] % MOD;
        return totalSpecialPermutations;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 6};
        int result = specialPerm(nums);
        System.out.println(result);
    }
}
