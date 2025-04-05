package org.example.WaysOfIteration.version3;

public class Main {
    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree(new TreeNode(10, null, null));
        bst.insert(new TreeNode(5, null, null));
        bst.insert(new TreeNode(15, null, null));
        bst.insert(new TreeNode(25, null, null));
        bst.insert(new TreeNode(35, null, null));
        bst.insert(new TreeNode(45, null, null));
        bst.insert(new TreeNode(55, null, null));
        display(bst);

        LinkedList ll = new LinkedList(new LinkedListNode(1, null));
        ll.insert(new LinkedListNode(2, null));
        ll.insert(new LinkedListNode(3, null));
        ll.insert(new LinkedListNode(4, null));
        ll.insert(new LinkedListNode(5, null));
        ll.insert(new LinkedListNode(6, null));
        ll.insert(new LinkedListNode(7, null));
        display(ll);
    }
    private static void display(Iterable iterable){
        Iterator iterator = iterable.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
