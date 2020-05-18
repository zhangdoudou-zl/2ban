/**
 * @program: 0518
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-18 12:49
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
        System.out.println("节点个数："+BinaryTree.size);
        System.out.println("节点个数："+binaryTree.getSize2(root));
        binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getLeafSize2(root));

        System.out.println(binaryTree.getKLevelSize(root,4));

        System.out.println("树的高度"+binaryTree.getHeight(root));

        Node ret =binaryTree.find(root,'A');
        System.out.println("查找结点val："+ret.val);

    }
}
