package Seminar;

public class Sem04 {
    public static void main(String[] args) {
//        Node root = new Node(1);
//        Node l1 = new Node(2);
//        Node r1 = new Node(3);
//
//        root.left = l1;
//        root.right = r1;
//
//        obxod(root);
//

        obxod(buildTree(5), "");


    }

    public static void obxod(Node root, String sp) {
        if (root != null) {
            System.out.println(sp + root.value);
            obxod(root.left,sp+ "  ");
            obxod(root.right,sp+ "  ");
        }
    }
    static int t = 0;
    public static Node buildTree(int n){
        Node root = new Node(t++);
        if (n == 0)
            return null;
        else {
            root.left = buildTree(n/2);
            root.right = buildTree(n - n/2 - 1);
        }
        return root;
    }

    public static class Node {

        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
