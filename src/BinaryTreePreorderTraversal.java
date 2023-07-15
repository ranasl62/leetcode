
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BinaryTreePreorderTraversal {
    List<Integer> outNode = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
//        dfs(root);
        withStack(root);
        return outNode;
    }

    private void withStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current == null) continue;
            outNode.add(current.val);
            stack.push(current.right);
            stack.push(current.left);
        }
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        outNode.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}