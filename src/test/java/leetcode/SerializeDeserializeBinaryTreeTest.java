package leetcode;

import leetcode.node.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeDeserializeBinaryTreeTest {

    @Test
    void test() {
        SerializeDeserializeBinaryTree s1 = new SerializeDeserializeBinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        root.right = two;
        two.left = three;
        String result = s1.serialize(root);
        System.out.println(result);

        TreeNode newRoot = s1.deserialize(result);
        System.out.println(newRoot);
    }

}