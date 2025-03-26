package org.example.designpatterns.strategyPattern.version2.Inserter;

import java.util.Collections;
import java.util.List;

public class OrderedInserter implements Inserter{

    @Override
    public void insert(Integer num, List<Integer> nums) {
        nums.add(num);
        Collections.sort(nums);
    }
}
