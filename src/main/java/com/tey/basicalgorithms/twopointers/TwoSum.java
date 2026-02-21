package com.tey.basicalgorithms.twopointers;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class TwoSum {

    public static void main(String[] args) {
        int target = 173;
        int[] arr = new int[]{12, 47, 83, 29, 156, 64, 91, 38, 205, 17, 73, 144, 58, 99, 31};

        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // the complementIndex exists to get the index of a complement
            // when we substract the array item from target, we get the complement
            // we pass the key (arr[i] = array element) to find the index of the complement in complements hashmap
            Integer complementIndex = complements.get(arr[i]);
            if (complementIndex != null) {
                //if the complementIndex is different from null, that means we found the complement
                System.out.println("Indexes: " + i + " " + complementIndex);
            } else {
                //while we don't find the complement, we add the complement to the hashmap
                // in this case, when we subtract 29 from 122, we get 93, that's how much left to reach 122 from 29
                int complement = target - arr[i];
                complements.put(complement, i);
            }
        }
    }

}
