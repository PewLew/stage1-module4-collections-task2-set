package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        for (var e : firstSet){
            if(secondSet.contains(e) && !thirdSet.contains(e)){
                set.add(e);
            }
        }

        for(var e : thirdSet){
            if (!firstSet.contains(e) && !secondSet.contains(e)){
                set.add(e);
            }
        }

        return set;
    }
}
