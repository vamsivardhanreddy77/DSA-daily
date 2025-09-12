package trees;
import java.util.Scanner;

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


class StringToTreeGFG {
    public static Node treeFromString(String s) {
       
        int idx[]=new int[]{0};
        return dfs(s,idx);
    }
    public static Node dfs(String s,int[] idx){
        if(idx[0]>=s.length()||s.charAt(idx[0])==')'){
            idx[0]++;
            return null;
        }
        int num=0;
        while(idx[0]<s.length()&&Character.isDigit(s.charAt(idx[0]))){
            num=num*10+(s.charAt(idx[0])-'0');
            idx[0]++;
        }
        
        Node head=new Node(num);
        if(idx[0]<s.length()&&s.charAt(idx[0])=='('){
            idx[0]++;
            head.left=dfs(s,idx);
        }
        if(idx[0]<s.length()&&s.charAt(idx[0])=='('){
            idx[0]++;
            head.right=dfs(s,idx);
        }
        idx[0]++;
        return head;
    }
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tree string: ");
        String input = sc.nextLine();

        Node root = treeFromString(input);

        System.out.print("Inorder Traversal: ");
        inorder(root);
        sc.close();
    }
}

