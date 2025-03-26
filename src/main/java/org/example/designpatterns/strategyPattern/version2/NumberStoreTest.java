package org.example.designpatterns.strategyPattern.version2;

import org.example.designpatterns.strategyPattern.version2.Inserter.OrderedInserter;
import org.example.designpatterns.strategyPattern.version2.Searcher.BinarySeacher;

public class NumberStoreTest {
    public static void main(String args[]){
        NumberStore numberStore = new NumberStore(new OrderedInserter(), new BinarySeacher());
        numberStore.insert(2);
        numberStore.insert(5);
        System.out.println(numberStore.search(2));
    }
}
