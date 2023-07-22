import java.util.ArrayList;
import java.util.List;

class RecentCounter {

    List<Integer> intgers;

    public RecentCounter() {
        this.intgers = new ArrayList<>();
    }

    public int ping(int t) {
        intgers.add(t);
        int start = Math.max(t - 3000, 0);
        int end = t;
        for (int i = 0; i < this.intgers.size(); i++) {
            if (this.intgers.get(i) >= start) {
                start = i;
                break;
            }
        }
        for (int i = this.intgers.size() - 1; i >= 0; i--) {
            if (this.intgers.get(i) <= end) {
                end = i;
                break;
            }
        }
        return end - start + 1;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */