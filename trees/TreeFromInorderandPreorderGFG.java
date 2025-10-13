package trees;
import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class TreeFromInorderandPreorderGFG {
    private static int idx;
    private static Map<Integer,Integer> inpos;
    public static Node buildTree(int inorder[], int preorder[]) {

        if (inorder == null || preorder == null || inorder.length != preorder.length || inorder.length == 0)
            return null;
        idx=0;
        inpos=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inpos.put(inorder[i],i);
        }
        return build(preorder,idx,inorder.length-1);
    }
    public static Node build(int[] preorder,int start,int end){
        if(start>end) return null;
        int rootval=preorder[idx++];
        Node root=new Node(rootval);
        if(start==end) return root;
        int index=inpos.get(rootval);
        root.left=build(preorder,start,index-1);
        root.right=build(preorder,index+1,end);
        return root;
    } 
}