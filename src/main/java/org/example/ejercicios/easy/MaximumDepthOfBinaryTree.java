package org.example.ejercicios.easy;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        int currentDepth = 0;
        // hay que ver todos los right, después algún left, y luego todos los right
        // e ir operando las profundidades a medida q entremos y salgamos.
        // quiza sea mejor una funcion recursiva?
        return recursiveFunc(root, maxDepth, currentDepth);
    }

    // returns maxDepth
    private int recursiveFunc(TreeNode tree, int maxDepth, int currentDepth) {
        if(tree == null) return maxDepth;
        currentDepth++;
        int depthRight = currentDepth;
        int depthLeft = currentDepth;


        if (tree.right != null) {
            depthRight = recursiveFunc(tree.right, maxDepth, currentDepth);
        }
        if (tree.left != null){
            depthLeft = recursiveFunc(tree.left, maxDepth, currentDepth);
        }

        currentDepth--;

        return depthRight > depthLeft ? depthRight : depthLeft;
    }
}