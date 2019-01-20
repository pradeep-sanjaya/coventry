/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 23
BinaryTree Traversal
InOrder, PreOrder, PostOrder
*/

package pdsa.tree;

public class BinaryTreeTraversal {

    static class Node {

        public Integer key;
        public Node left, right;

        Node(Integer key) {
            this.key = key;
            left = right = null;
        }

        public void traverseInOrder() {

            if (this.left != null) {
                this.left.traverseInOrder();
            }

            System.out.print(this.key + "\t");

            if (this.right != null) {
                this.right.traverseInOrder();
            }
        }

        public void traversePreOrder() {

            System.out.print(this.key + "\t");

            if (this.left != null) {
                this.left.traverseInOrder();
            }

            if (this.right != null) {
                this.right.traverseInOrder();
            }
        }

        public void traversePostOrder() {

            if (this.left != null) {
                this.left.traverseInOrder();
            }

            if (this.right != null) {
                this.right.traverseInOrder();
            }

            System.out.print(this.key + "\t");
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree(){
            root = null;
        }

        BinaryTree(Integer key) {
            root = new Node(key);
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        System.out.print("InOrder\n");
        tree.root.traverseInOrder();
        System.out.print("\n\n");

        System.out.print("PreOrder\n");
        tree.root.traversePreOrder();
        System.out.print("\n\n");

        System.out.print("PostOrder\n");
        tree.root.traversePostOrder();

    }
}