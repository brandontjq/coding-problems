package ctci.treesandgraphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTCustomTest {

    @Test
    void test() {
        BSTCustom bstCustom = new BSTCustom(10);
        bstCustom.insertInOrder(7);
        bstCustom.insertInOrder(5);
        bstCustom.insertInOrder(3);
        bstCustom.insertInOrder(13);
        bstCustom.insertInOrder(15);
        bstCustom.inorder();
        System.out.println(bstCustom.getRandomNode());
        System.out.println(bstCustom.getSizeOfRoot());
        System.out.println(bstCustom.find(15));

    }

}