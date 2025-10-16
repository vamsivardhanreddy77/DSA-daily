package trees;

import java.util.HashMap;
import java.util.Stack;

public class MirrorCheckInNryTree {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {

        HashMap<Integer, Stack<Integer>> mapA = new HashMap<>();
        for (int i = 0; i < 2 * e; i += 2) {
            int parent = A[i];
            int child = A[i + 1];
            mapA.computeIfAbsent(parent, v -> new Stack<>()).push(child);
        }
        for (int i = 0; i < 2 * e; i += 2) {
            int parent = B[i];
            int child = B[i + 1];
            if (mapA.get(parent).isEmpty() || !mapA.containsKey(parent) || mapA.get(parent).peek() != child) {
                return 0;
            }
            mapA.get(parent).pop();

        }
        return 1;
    }
}
