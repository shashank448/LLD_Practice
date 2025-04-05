package org.example.WaysOfIteration.version1;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private final List<Integer> internalList;

    public MyList(){
        internalList = new ArrayList<>();
    }
    public void insert(Integer x){
        this.internalList.add(x);
    }

    public List<Integer> getData() {
        return internalList;
    }
}
