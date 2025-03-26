package org.example.designpatterns.strategyPattern.version2;

import org.example.designpatterns.strategyPattern.version2.Inserter.Inserter;
import org.example.designpatterns.strategyPattern.version2.Searcher.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    private final List<Integer> nums;
    private final Inserter inserter;
    private final Searcher searcher;
    public NumberStore(Inserter inserter, Searcher searcher){
        this.inserter = inserter;
        this.searcher = searcher;
        this.nums = new ArrayList<>();
    }
    public void insert(Integer num){
        inserter.insert(num, this.nums);
    }
    public Integer search(Integer key){
        return searcher.search(key, this.nums);
    }
}
