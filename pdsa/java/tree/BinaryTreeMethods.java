/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 24
BinaryTree Methods
addNode
*/

package pdsa.tree;

public class BinaryTreeMethods {

    static class Node {

        public Integer key;
        public Node left, right;

        Node(Integer key) {
            this.key = key;
            left = right = null;
        }

        public void addNode(int num) {

            Node newNode = new Node(num);

            if (num < this.key) {
                if (this.left != null) {
                    this.left.addNode(num);
                } else {
                    this.left = newNode;
                }
            } else {
                if (this.right != null) {
                    this.right.addNode(num);
                } else {
                    this.right = newNode;
                }
            }
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
                this.left.traversePreOrder();
            }

            if (this.right != null) {
                this.right.traversePreOrder();
            }
        }

        public void traversePostOrder() {

            if (this.left != null) {
                this.left.traversePostOrder();
            }

            if (this.right != null) {
                this.right.traversePostOrder();
            }

            System.out.print(this.key + "\t");
        }
    }

    static class BinaryTree {
        Node root;

        public BinaryTree(){
            root = null;
        }

        public void addNode(int num) {
            if (root == null) {
                this.root = new Node(num);
            } else {
                this.root.addNode(num);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(20);
        tree.addNode(15);
        tree.addNode(200);
        tree.addNode(25);
        tree.addNode(5);
        tree.addNode(0);
        tree.addNode(100);

        System.out.println("\n=== pre order ===");
        tree.root.traversePreOrder();

        System.out.println("\n=== post order ===");
        tree.root.traversePostOrder();

        System.out.println("\n=== in order ===");
        tree.root.traverseInOrder();

        //https://www.cs.usfca.edu/~galles/visualization/BST.html
    }
}