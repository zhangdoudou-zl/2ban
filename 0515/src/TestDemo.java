import javax.swing.*;

/**
 * @program: 0515
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-15 20:15
 **/
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        binaryTree.getSize1(root);
        System.out.println("节点的个数："+ BinaryTree.size);
        System.out.println("节点的个数："+binaryTree.getSize2(root));

        binaryTree.getLeafSize1(root);
        System.out.println("叶子节点的个数："+BinaryTree.leafSize);
        System.out.println("叶子节点的个数："+binaryTree.getLeafSize2(root));

    }
}

