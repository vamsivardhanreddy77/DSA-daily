package trees;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}

class SumTreeGFG {
    public void toSumTree(Node root) {
  
        sumtree(root);
    }
    public int sumtree(Node node){
        if(node ==null) return 0;
        
         
        int leftsum=sumtree(node.left);
        int rightsum=sumtree(node.right);
        int oldval=node.data;
        node.data=leftsum+rightsum;
        return oldval+node.data;
    }
}