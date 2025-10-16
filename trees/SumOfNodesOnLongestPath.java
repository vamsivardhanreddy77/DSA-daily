package trees;
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} 
class SumOfNodesOnLongestPath {
    static class Pair {
        int sum;
        int length;

        Pair(int sum, int length) {
            this.sum = sum;
            this.length = length;
        }
    }
    public int sumOfLongRootToLeafPath(Node root) {
        
        Pair result = helper(root);
        return result.sum;
    
    }
    private static Pair helper(Node node) {
        if(node==null ) return new Pair(0,0);
        Pair left=helper(node.left);
        Pair right=helper(node.right);
        if(left.length>right.length){
            return new Pair(left.sum + node.data, left.length + 1);
        }else if(left.length<right.length){
            return new Pair(right.sum + node.data, right.length + 1);
        }else{
            int maxsum=Math.max(left.sum,right.sum);
            return new Pair(node.data+maxsum,right.length+1);
        }
        
        
    }
    
}