package org.example.WaysOfIteration.version2;


import org.example.WaysOfIteration.version1.LinkedList;
import org.example.WaysOfIteration.version1.LinkedListNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(new TreeNode(0, null, null));
        display(bst);

        LinkedList ll = new LinkedList(new LinkedListNode(0, null));
        //display(ll);


    }
    private static  void display(DataStructure dataStructure){
        List<Integer> data = dataStructure.getData();
        for(int i=0;i<data.size();i++){
            System.out.println(i);
        }
    }
}