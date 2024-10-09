import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    int index = 0;

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode insertTree(int[] values) {
        if (index >= values.length || values[index] == -1) {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(values[index++]);
        root.left = insertTree(values);
        root.right = insertTree(values);
        return root;
    }

    // Average of levels of a tree || LEETCODE 637
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  // Initialize the queue with the root node
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            double averageLevel = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                averageLevel += curr.data;

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            averageLevel = averageLevel / size;
            result.add(averageLevel);
        }
        return result;
    }

    // Level Order Traversal
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  // Initialize the queue with the root node
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.data);

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }  
            }
            result.add(level);
        }
        return result;
    }

    // Traversal in Inorder
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Traversal in PreOrder
    public void preOrder(TreeNode root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Traversal in PostOrder
    public void postOrder(TreeNode root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] values = {3, 9, 20, -1, -1, 15, 7};

        BinaryTree tree = new BinaryTree();

        TreeNode root = tree.insertTree(values);
        
        // List<Double> averages = tree.averageOfLevels(root);
        // System.out.println(averages);

      List<List<Integer>> levels = tree.levelOrder(root);

      System.out.println(levels);
        
        // tree.inOrder(root);

        // tree.preOrder(root);

        // tree.postOrder(root);
    }
}
