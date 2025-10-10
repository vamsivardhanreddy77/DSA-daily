package trees;

import java.util.ArrayList;
import java.util.Stack;

public class BoundaryTreeTraversalGFG {

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

    ArrayList<Integer> boundaryTraversal(Node node) {

        ArrayList<Integer> res=new ArrayList<>();
        if(node==null) return res;
        if(!isLeaf(node)) res.add(node.data);
        addLeft(node.left,res);
        addLeaves(node,res);
        addright(node.right,res);
        return res;
        
    }
    public boolean isLeaf(Node node){
        return (node.left==null&&node.right==null);
    }
    public  void addLeft(Node node,ArrayList<Integer> res){
        while(node!=null){
            if(!isLeaf(node)) res.add(node.data);
            if(node.left!=null) node=node.left;
            else node=node.right;
        }
    }
    void addLeaves(Node node, ArrayList<Integer> res) {
        if (node == null) return;
        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }
    public void addright(Node node,ArrayList<Integer> res){
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) stack.push(node.data);
            if (node.right != null) node = node.right;
            else node = node.left;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }
}

