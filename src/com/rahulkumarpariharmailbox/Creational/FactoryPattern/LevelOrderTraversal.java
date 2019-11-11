package com.rahulkumarpariharmailbox.Creational.FactoryPattern;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal implements GraphTraversal {
    /**
     * Traverse and print
     *
     * @param tree root node of the tree
     */
    @Override
    public void traverse(Tree tree) {
        Queue<Tree.TreeNode> queue = new LinkedList<>();

        if (tree.root == null) {
            System.out.println("Empty tree");
            return;
        }

        queue.offer(tree.root);
        while (!queue.isEmpty()) {
            int sizeOfLevel = queue.size();

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < sizeOfLevel; i++) {
                Tree.TreeNode currentNode = queue.poll();
                if (currentNode != null) {
                    stringBuilder.append(currentNode.val);
                    stringBuilder.append(" ");

                    if (currentNode.leftChild != null)
                        queue.offer(currentNode.leftChild);

                    if (currentNode.rightChild != null)
                        queue.offer(currentNode.rightChild);
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
