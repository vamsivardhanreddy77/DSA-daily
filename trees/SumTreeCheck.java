package trees;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}


public class SumTreeCheck {
    boolean issum=true;
    boolean isSumTree(Node root) {
        
        sum(root);
        return issum;
    }
    int sum(Node root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return root.data;
        int Left=sum(root.left);
        int Right=sum(root.right);
        if(root.data!=Left+Right) issum=false;
        return root.data+Left+Right;
       
    }
}
