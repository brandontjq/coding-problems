package ctci.treesandgraphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void test() {
        TreeNode root = new TreeNode(10);
        root.insertInOrder(5);
        root.insertInOrder(3);
        root.insertInOrder(13);
        root.insertInOrder(15);
        assertNotNull(root);
        root.inorder(root);
        System.out.println(root.getRandomNode().data);

    }

}