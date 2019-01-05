package pdsa;

import com.sun.org.apache.xpath.internal.SourceTree;

public class BinaryTreeGiven {

    static class Node {

        public Integer key;
        public Node left, right;

        Node(Integer key) {
            this.key = key;
            left = right = null;
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

        /* create root */
        tree.root = new Node(1);
        /*
            1
          /   \
        null  null
        */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        /*
            1
          /   \
         2      3
        */

        tree.root.left.left = new Node(4);

        /*
                1
              /   \
            2      3
          /   \
         2    null
        */

        print(tree);
    }

    public static void print(BinaryTree tree) {
        Node current = tree.root;
        printNode(current);
    }

    public static void printNode(Node node) {
        if (node != null) {
            System.out.println(node.key);
            if (node.left != null) {
                System.out.print(node.left.key + " ");
            }

            if (node.right!= null) {
                System.out.println(node.right.key);
            }

            System.out.println("\n");
        }
    }

}

//A - tree.root.right.left
//B - tree.root.left.left.right
