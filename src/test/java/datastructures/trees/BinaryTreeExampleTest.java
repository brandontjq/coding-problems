package datastructures.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeExampleTest {

    @Test
    void traversalTest() {
        TreeNode<Integer> twentyFive = new TreeNode<>(25);
        TreeNode<Integer> fifteen = new TreeNode<>(15);
        TreeNode<Integer> fifty = new TreeNode<>(50);
        TreeNode<Integer> ten = new TreeNode<>(10);
        TreeNode<Integer> twentyTwo = new TreeNode<>(22);
        TreeNode<Integer> thirtyFive = new TreeNode<>(35);
        TreeNode<Integer> seventy = new TreeNode<>(70);
        TreeNode<Integer> four = new TreeNode<>(4);
        TreeNode<Integer> twelve = new TreeNode<>(12);
        TreeNode<Integer> eighteen = new TreeNode<>(18);
        TreeNode<Integer> twentyFour = new TreeNode<>(24);
        TreeNode<Integer> thirtyOne = new TreeNode<>(31);
        TreeNode<Integer> fortyFour = new TreeNode<>(44);
        TreeNode<Integer> sixtySix = new TreeNode<>(66);
        TreeNode<Integer> ninety = new TreeNode<>(90);

        twentyFive.leftChild = fifteen;
        twentyFive.rightChild = fifty;

        fifteen.leftChild = ten;
        fifteen.rightChild = twentyTwo;

        ten.leftChild = four;
        ten.rightChild = twelve;

        twentyTwo.leftChild = eighteen;
        twentyTwo.rightChild = twentyFour;

        fifty.leftChild = thirtyFive;
        fifty.rightChild = seventy;

        thirtyFive.leftChild = thirtyOne;
        thirtyFive.rightChild = fortyFour;

        seventy.leftChild = sixtySix;
        seventy.rightChild = ninety;

        BinaryTreeExample b = new BinaryTreeExample();
        //b.preorder(twentyFive);
        //b.inorder(twentyFive);
        b.postorder(twentyFive);
    }

    @Test
    void maxDepthTest() {
        TreeNode<Integer> one = new TreeNode<>(1);
        TreeNode<Integer> two = new TreeNode<>(2);
        TreeNode<Integer> three = new TreeNode<>(3);
        TreeNode<Integer> four = new TreeNode<>(4);
        TreeNode<Integer> five = new TreeNode<>(5);
        TreeNode<Integer> six = new TreeNode<>(6);
        TreeNode<Integer> seven = new TreeNode<>(7);

        one.leftChild = two;
        one.rightChild = three;
        two.leftChild = six;
        two.rightChild = seven;
        three.rightChild = four;
        four.rightChild = five;

        BinaryTreeExample b = new BinaryTreeExample();
        int resultRecursive = b.maxDepthRecursive(one);
        System.out.println(resultRecursive);
        int resultIterative = b.maxDepthIterative(one);
        System.out.println(resultIterative);
    }

    @Test
    void printAllPathsFromRootToLeafTest() {
        TreeNode<Integer> one = new TreeNode<>(1);
        TreeNode<Integer> two = new TreeNode<>(2);
        TreeNode<Integer> three = new TreeNode<>(3);
        TreeNode<Integer> five = new TreeNode<>(5);

        one.leftChild = two;
        one.rightChild = three;
        two.rightChild = five;

        BinaryTreeExample b = new BinaryTreeExample();

        List<String> result = b.printAllPathsFromRootToLeaf(one);
        System.out.println(result);
    }

    @Test
    void countSumFromRootToLeafTest() {
        TreeNode<Integer> one = new TreeNode<>(1);
        TreeNode<Integer> two = new TreeNode<>(2);
        TreeNode<Integer> three = new TreeNode<>(3);
        TreeNode<Integer> five = new TreeNode<>(5);

        one.leftChild = two;
        one.rightChild = three;
        two.rightChild = five;

        BinaryTreeExample b = new BinaryTreeExample();

        List<Integer> result = b.countSumFromRootToLeaf(one);
        System.out.println(result);
    }

}