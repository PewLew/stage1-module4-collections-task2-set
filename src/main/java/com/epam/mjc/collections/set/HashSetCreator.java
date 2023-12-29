package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> mySet = new HashSet<>();
        for(int e:sourceList){
            mySet.add(e);
            if(e%2 == 0){
                int x = e/2;
                while(x%2==0){
                    mySet.add(x);
                    x = x/2;
                }
                mySet.add(x);
            }
            else {
                mySet.add(e*2);
            }
        }

        return mySet;
    }
}
