package trees;
import java.util.*;
class Node{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class DuplicateSubTree {
    boolean flag = false;
    public int dupSub(Node root) {
        HashSet<String> set = new HashSet<>();
        serialize(root, set);
        return flag ? 1 : 0;
    }

    String serialize(Node root, HashSet<String> set) {
        if (root == null) return "#";
        if (root.left == null && root.right == null) 
            return String.valueOf(root.data);

        String s = root.data + "," + serialize(root.left, set) + "," + serialize(root.right, set);

        if (set.contains(s)) flag = true;
        else set.add(s);

        return s;
    }
}
