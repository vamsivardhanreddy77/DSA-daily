package trees;
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
class LargestSubTreeSum {
    private static int Maxsum;
    public static int findLargestSubtreeSum(Node root) {

        Maxsum=Integer.MIN_VALUE;
        LargestSum(root);
        return Maxsum;
    }
    public static int LargestSum(Node root){
        if (root==null) return 0;
        int left=LargestSum(root.left);
        int right=LargestSum(root.right);
        int sum=left+right+root.data;
        Maxsum=Math.max(Maxsum,sum);
        return sum;
    }
}

