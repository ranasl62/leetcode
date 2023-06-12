import java.util.HashMap;
import java.util.Map;

class TrieNode {
    int count;
    Map<Integer, TrieNode> children;

    public TrieNode() {
        this.count = 0;
        this.children = new HashMap<>();
    }
}

class Trie {
    TrieNode trie;

    public Trie() {
        this.trie = new TrieNode();
    }

    public void insert(int[] array) {
        TrieNode myTrie = this.trie;
        for (int a : array) {
            if (!myTrie.children.containsKey(a)) {
                myTrie.children.put(a, new TrieNode());
            }
            myTrie = myTrie.children.get(a);
        }
        myTrie.count += 1;
    }

    public int search(int[] array) {
        TrieNode myTrie = this.trie;
        for (int a : array) {
            if (myTrie.children.containsKey(a)) {
                myTrie = myTrie.children.get(a);
            } else {
                return 0;
            }
        }
        return myTrie.count;
    }
}

class Solution {
    public int equalPairs(int[][] grid) {
        Trie myTrie = new Trie();
        int count = 0, n = grid.length;

        for (int[] row : grid) {
            myTrie.insert(row);
        }

        for (int c = 0; c < n; ++c) {
            int[] colArray = new int[n];
            for (int r = 0; r < n; ++r) {
                colArray[r] = grid[r][c];
            }
            count += myTrie.search(colArray);
        }

        return count;
    }
}

public class EqualRowandColumnPairs {
    public int equalPairs(int[][] grid) {

        int count = 0;
        boolean match;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                match = true;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        match = false;
                        break;
                    }
                }
                if (match) count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {

    }
}
