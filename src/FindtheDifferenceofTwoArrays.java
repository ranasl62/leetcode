import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> num2Set = new HashSet<>();

        for (int n : nums1) num1Set.add(n);
        for (int n : nums2) num2Set.add(n);

        num1Set.forEach(n -> {
            System.out.println(n);
            if (!num2Set.contains(n)) {
                answer.get(0).add(n);
            }
        });
        num2Set.forEach(n -> {
            if (!num1Set.contains(n)) {
                answer.get(1).add(n);
            }
        });
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new FindtheDifferenceofTwoArrays().findDifference(new int[]{1, 2, 3, 3}, new int[]{2, 3, 4}));
    }
}
