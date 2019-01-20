package pdsa.tree;

public class BinaryTreeMy {

    static class Node {

        private String data;
        private static Node left;
        private static Node right;

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node node) {
            left = node;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node node) {
            right = node;
        }

        public Node(String data, Node left, Node right) {
            this.data = data;
            this.left  = left;
            this.right = right;
        }
    }

    public static Node root;

    public static void main(String[] args) {
        root = new Node("A",
            new Node("B", null, null),
            new Node("C", null, null)
        );

        print();
    }

    public static void print() {
        Node current = root;
        System.out.println(current.data);

        System.out.println(current.getLeft().data);
        System.out.println(current.getRight().data);
    }

}

//A - tree.root.right.left
//B - tree.root.left.left.right
