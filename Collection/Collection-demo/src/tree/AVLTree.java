package tree;

public class AVLTree {
    class Node {
        int data;
        int height; //depth
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

        private Node root;

        public int height(Node N){
            if(N == null) return 0;
            return N.height;
        }

        public int getBalance(Node N){
            if(N == null) return 0;
            return height(N.left) - height(N.right);
        }

        public Node rightRotate(Node y){
            Node x = y.left;
            Node T2 = x.right;

            x.right = y;
            y.left = T2; //right rotation

            x.height = Math.max(height(y.left),height(y.right)) + 1;
            y.height = Math.max(height(x.left),height(x.right)) + 1;
            return x;
        }

        public Node leftRotate(Node x){
            Node y = x.right;
            Node T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Math.max(height(x.left),height(x.right)) + 1;
            y.height = Math.max(height(y.left),height(y.right)) + 1;

            return y;
        }

        public Node insert(Node node, int data){
            if(node == null) return new Node(data);
            if(data < node.data) {
                node.left = insert(node.left, data);
            } else if(data < node.data){
                node.right = insert(node.right,data);
            } else {
                return node;
            }
            node.height = 1 + Math.max(height(node.left),height(node.right));
            int balance = getBalance(node);
            if(balance > 1 && data < node.left.data){ //left left case
                return rightRotate(node);
            }
            if(balance< -1 && data > node.right.data){ //right right case
                return leftRotate(node);
            }
            if(balance > 1 && data > node.left.data) { //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
            if(balance < -1 && data < node.right.data) { //right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
            return node;
        }

        public void add(int data){
            root = insert(root,data);
        }

        public void printInOrder(){
            System.out.println("Sorted Tree (InOrder)");
            inOrder(root);
            System.out.println("");
        }

        public void inOrder(Node node){
            if(node != null){
                inOrder(node.left);
                System.out.print(node.data + " ");
                inOrder(node.right);
            }
        }

        public void printDepth(){
            System.out.println("Tree Depth: " + height(root) + ".");
        }

    }

