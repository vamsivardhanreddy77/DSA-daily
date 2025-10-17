package trees;
class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class MaximumNonAdjacentNodesSum {
    public static class Pair{
        int include;
        int exclude;
        Pair(int include,int exclude){
            this.include=include;
            this.exclude=exclude;
        }
    }
    public static int getMaxSum(Node root) {
        // code here
        Pair result=MaxSum(root);
        return Math.max(result.include,result.exclude);
    }
    public static Pair MaxSum(Node root){
        if(root==null) return new Pair(0,0);
        Pair left=MaxSum(root.left);
        Pair right=MaxSum(root.right);
        int include=root.data+left.exclude+right.exclude;
        int exclude=Math.max(left.include,left.exclude)+Math.max(right.include,right.exclude);
        return new Pair(include,exclude);
    }
}

