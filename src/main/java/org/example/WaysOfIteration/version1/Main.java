package org.example.WaysOfIteration.version1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(new TreeNode(0, null, null));
        List<TreeNode> nodes = bst.getData();

        for(int i=0;i<nodes.size();i++){
            System.out.println(nodes.get(i).getData());
        }

        LinkedList ll = new LinkedList(new LinkedListNode(0 , null));
        LinkedListNode[] llNodes = ll.getData();
        for(LinkedListNode node : llNodes){
            System.out.println(node.getVal());
        }

    }
}