package leetcode;

import datastructures.linkedlist.Link;
import leetcode.node.TreeNode;

import java.util.*;

public class SerializeDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode node, StringBuilder sb) {
        if(node == null) {
            sb.append("X").append(",");
            return;
        }
        sb.append(node.val).append(",");
        preorder(node.left, sb);
        preorder(node.right, sb);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(",")));
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue) {
        String val = queue.poll();
        if(val.equals("X")) {
            return null;
        }
        TreeNode newNode = new TreeNode(Integer.parseInt(val));
        newNode.left = buildTree(queue);
        newNode.right = buildTree(queue);
        return newNode;
    }
}
