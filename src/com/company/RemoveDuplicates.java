package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    public int[] removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {
            set.add(j);
        }

        int[] res = new int[set.size()];
        Iterator<Integer> itr = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            res[i] = itr.next();
        }

        return res;
    }
}
