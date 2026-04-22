package datastructures.trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class BinaryTreeExample{
    //Preorder, Inorder, Postorder traversal
    public void preorder(TreeNode<Integer> root) {
        if(root == null) return;
        System.out.print(root.value + ", ");
        preorder(root.leftChild);
        preorder(root.rightChild);
    }

    public void inorder(TreeNode<Integer> root) {
        if(root == null) return;
        inorder(root.leftChild);
        System.out.print(root.value + ", ");
        inorder(root.rightChild);
    }

    public void postorder(TreeNode<Integer> root) {
        if(root == null) return;
        postorder(root.leftChild);
        postorder(root.rightChild);
        System.out.print(root.value + ", ");
    }

    //Find max depth of binary tree
    public int maxDepthRecursive(TreeNode<Integer> root) {
        if(root == null) return 0;

        int left = maxDepthRecursive(root.leftChild);
        int right = maxDepthRecursive(root.rightChild);

        return Math.max(left, right) + 1;
     }

     public int maxDepthIterative(TreeNode<Integer> root) {
        int result = 0;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode<Integer> polledNode = queue.poll();
                if(polledNode.leftChild != null) {
                    queue.add(polledNode.leftChild);
                }
                if(polledNode.rightChild != null) {
                    queue.add(polledNode.rightChild);
                }
            }
            result++;
        }
        return result;
     }

     //Printing all paths from Root To Leaf
     public List<String> printAllPathsFromRootToLeaf(TreeNode<Integer> root) {
        List<String> result = new ArrayList<>();
        solvePrintAllPathsFromRootToLeaf(root, "", result);
        return result;
     }

     private void solvePrintAllPathsFromRootToLeaf(TreeNode<Integer> node, String path, List<String> result) {
        if(node == null) {
            return;
        }

        if(node.leftChild == null && node.rightChild == null) {
            result.add(path + node.value);
        }

        solvePrintAllPathsFromRootToLeaf(node.leftChild, path + node.value + "->", result);
        solvePrintAllPathsFromRootToLeaf(node.rightChild, path + node.value + "->", result);

     }

     //Printing all sum from Root To Leaf
     public List<Integer> countSumFromRootToLeaf(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        solveCountSumFromRootToLeaf(root, 0, result);
        return result;
     }

     private void solveCountSumFromRootToLeaf(TreeNode<Integer> node, int sum, List<Integer> result) {
        if(node == null) return;
        if(node.leftChild == null && node.rightChild == null) {
            sum += node.value;
            result.add(sum);
            return;
        }
        sum += node.value;
        solveCountSumFromRootToLeaf(node.leftChild, sum, result);
        solveCountSumFromRootToLeaf(node.rightChild, sum, result);

     }




}
