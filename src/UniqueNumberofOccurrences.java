import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : arr) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        hashMap.forEach((integer, integer2) -> {
            hashSet.add(integer2);
        });
        return hashMap.size() == hashSet.size();
    }
}
