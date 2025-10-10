package trees;

class Node {
    int data;
    Node left, right;

    Node() {
        this.data = 0;
        this.left = this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreetoDLLGFG {
    private Node prev = null; 
    private Node head = null; 
    Node bToDLL(Node root) {

        prev = null;
        head = null;
        inorder(root);
        return head;
    }
    private void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        if(prev==null) head=node;
        else {
            prev.right=node;
            node.left=prev;
        }
        prev=node;
        inorder(node.right);
    }
}   

