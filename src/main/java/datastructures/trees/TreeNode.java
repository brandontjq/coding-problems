package datastructures.trees;

public class TreeNode<E> {
    public E value;
    public TreeNode<E> parent;
    public TreeNode<E> leftChild;
    public TreeNode<E> rightChild;

    public TreeNode(E value, TreeNode<E> parent) {
        this.value = value;
        this.parent = parent;
        this.leftChild = null;
        this.rightChild = null;
    }

    public TreeNode(E value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public TreeNode<E> setLeftChild(E leftChild) {
        this.leftChild = new TreeNode<>(leftChild, this);
        return this.leftChild;
    }

    public TreeNode<E> setRightChild(E rightChild) {
        this.rightChild = new TreeNode<>(rightChild, this);
        return this.rightChild;
    }
}
