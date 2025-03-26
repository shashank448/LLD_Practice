package org.example.designpatterns.strategyPattern.version2.Searcher;

import java.util.List;

public class BinarySeacher implements Searcher{

    @Override
    public Integer search(Integer key, List<Integer> nums) {
        int l = 0;
        int h = nums.size()-1;
        while(l<=h){
            int m = (l+h)/2;
            if(nums.get(m)==key)
                return m;
            else if(nums.get(m)<key)
                l=m+1;
            else
                h=m-1;
        }
        return -1;
    }
}
