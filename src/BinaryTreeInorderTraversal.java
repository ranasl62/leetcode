import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            if(current==null) continue;
            result.add(current.val);
            stack.push(current.right);
            stack.push(current.left);
        }
        return result;
    }
}
