package ctci.treesandgraphs;

import java.util.Random;

public class TreeNode {
    public int data;
    private TreeNode left;
    private TreeNode right;
    private int size = 0;

    public TreeNode(int data) {
        this.data = data;
        this.size = 1;
    }

    public TreeNode getRandomNode() {
        int leftSize = left == null ? 0 : left.size;
        Random random = new Random();
        int index = random.nextInt(size);
        if (index < leftSize) {
            return left.getRandomNode();
        } else if (index == leftSize) {
            return this;
        } else {
            return right.getRandomNode();
        }
    }

    public void inorder(TreeNode n) {
        if(n == null) {
            return;
        }
        inorder(n.left);
        System.out.print(n.data+ " ");
        inorder(n.right);
    }

    public void insertInOrder(int d) {
        if (d <= data) {
            if(left == null) {
                left = new TreeNode(d);
            } else {
                left.insertInOrder(d);
            }
        } else {
            if(right == null) {
                right = new TreeNode(d);
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }
}
