import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> mapNums = new HashMap<>();
        HashMap<Integer, Integer> uniqueCheck = new HashMap<>();
        int sum = 0, k;
        for (int i = 0; i < nums.length; i++) {
            mapNums.put(-1 * nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (mapNums.containsKey(sum) && mapNums.get(sum) != i && i != j && j != mapNums.get(sum) && i < j && j < mapNums.get(sum)) {
                    k = mapNums.get(sum);
                    if (isUnique(uniqueCheck, nums, i, j, k)) {
                        result.add(List.of(new Integer[]{nums[i], nums[j], nums[k]}));
                    }
                }
            }
        }
        return result;

    }

    private boolean isUnique(HashMap<Integer, Integer> uniqueCheck, int[] nums, int i, int j, int k) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 1, -1}));
    }
}
