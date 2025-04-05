package org.example.WaysOfIteration.version2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedList implements DataStructure{
    private LinkedListNode head;

    public LinkedList(LinkedListNode head) {
        this.head = head;
    }
    public void insert(LinkedListNode node){
        LinkedListNode previous = head;
        while(previous.getNext()!=null){
            previous = previous.getNext();
        }
        previous.setNext(node);
    }
    public List<Integer> getData(){
        LinkedListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.getNext();
            count++;
        }
        LinkedListNode[] nodes = new LinkedListNode[count];
        temp = head;
        count = 0;
        while(temp!=null){
            nodes[count++] =temp;
            temp = temp.getNext();
        }
        return new ArrayList<>();
    }
}
