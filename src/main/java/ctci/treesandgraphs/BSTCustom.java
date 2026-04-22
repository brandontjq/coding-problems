package ctci.treesandgraphs;

import java.util.Random;

public class BSTCustom {

    private static class Node {
        public int data;
        private Node left;
        private Node right;
        private int size;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public BSTCustom(int val) {
        this.root = new Node(val);
    }

    public void insertInOrder(int d) {
        root = insertInOrder(root, d);
    }

    private Node insertInOrder(Node n, int d) {
        if(n == null) {
            n = new Node(d);
            return n;
        }
        if (d <= n.data) {
            n.left = insertInOrder(n.left, d);

        } else {
            n.right = insertInOrder(n.right, d);
        }
        n.size++;
        return n;
    }

    public void inorder() {
        inorder(root);
    }
    private void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public int find(int val) {
        return find(root, val);
    }
    private int find(Node root, int val) {
        if(root.data == val) {
            return root.size;
        } else if (val <= root.data) {
            return root.left != null ? find(root.left, val) : -1;
        } else if (val > root.data) {
            return root.right != null ? find(root.right, val) : -1;
        }
        return -1;
    }

    public Node getRandomNode() {
        return getRandomNode(root);
    }

    private Node getRandomNode(Node n) {
        int leftSize = n.left == null ? 0 : n.left.size;
        Random random = new Random();
        int index = random.nextInt(n.size);
        if (index < leftSize) {
            return getRandomNode(n.left);
        } else if (index == leftSize) {
            System.out.println("RANDOM NODE: " + n.data);
            return n;
        } else {
            return getRandomNode(n.right);
        }
    }

    public int getSizeOfRoot() {
        return root.size;
    }

}
