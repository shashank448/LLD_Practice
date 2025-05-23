package org.example.WaysOfIteration.version3;

import org.example.WaysOfIteration.version2.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class MyList implements Iterable {
    private final List<Integer> internalList;

    public MyList(){
        internalList = new ArrayList<>();
    }
    public void insert(Integer x){
        this.internalList.add(x);
    }



    @Override
    public Iterator getIterator() {
        return new MyListIterator(this.internalList);
    }
}
