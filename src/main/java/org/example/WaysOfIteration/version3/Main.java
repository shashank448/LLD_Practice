package org.example.WaysOfIteration.version3;

public class Main {
    public static void main(String args[]){

    }
    private static void display(Iterable iterable){
        Iterator iterator = iterable.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
