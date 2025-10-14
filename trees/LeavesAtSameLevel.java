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


class LeavesAtSameLevel {
    boolean check(Node root) {
        
        int[] leaflevel=new int[1];
        return checklevel(root,1,leaflevel);
        
    }
    boolean checklevel(Node root,int level,int[] leaflevel){
        if(root==null) return true;
        if(root.left==null&&root.right==null){
            if(leaflevel[0]==0){
                leaflevel[0]=level;
                return true;
            }
            return leaflevel[0]==level;
        }
        return checklevel(root.left,level+1,leaflevel)&&checklevel(root.right,level+1,leaflevel);
    }
}