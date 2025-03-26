package org.example.designpatterns.strategyPattern.version1;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    private final List<Integer> nums;
    private final InsertStrategy insertStrategy;
    private final SearchStrategy searchStrategy;

    public NumberStore(InsertStrategy insertStrategy, SearchStrategy searchStrategy){
        this.nums = new ArrayList<>();
        this.insertStrategy = insertStrategy;
        this.searchStrategy = searchStrategy;
    }
    // inserts the number according to the insert strategy
    public void insert(Integer num){
        if(insertStrategy.equals(InsertStrategy.UNORDERED)){

        }else{

        }
    }
    // returns the index at which key is present
    public Integer search(Integer key){
        if(searchStrategy.equals(SearchStrategy.LINEAR)){

        }else{

        }
        return -1;
    }
    private void orderedInsert(Integer num){

    }
    private void unorderedInsert(Integer num){
        this.nums.add(num);
    }
    private Integer linearSearch(Integer key){
        return  -1;
    }
    private Integer binarySearch(Integer key){
        return null;
    }

}
/*
* Problems with existing code :
*   -- when there are new Search or Insert strategy are there, then we will keep on adding more or more methods
*   -- Code of search and insert is very clumsy, we have lot of if else conditions
*   -- This class does not follow open closed principle
*   -- Very big class
*   -- Code not so readable
*
*   -- Someone can think of having 2 more classes named Inserter and Searcher which will contains
*       all the different strategies of Searching and Inserting
*       But again this will violate the SOLID priciples as now your class will be dependent on 2 concreate classes
*       Also the if else condition will still be there as you need to call the particular kind of insert method from Inserter
*       or particular kind of search method from Searcher.
*       Overall this also would not help
*
*   --
*
* */
