package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
            TreeSet<Integer> myTree = new TreeSet<>();
            for(var e : sourceList){
                    myTree.add(e*e);
            }

            return myTree.subSet(lowerBound, upperBound+1);
    }
}
