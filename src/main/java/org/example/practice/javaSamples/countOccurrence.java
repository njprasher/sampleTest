package org.example.practice.javaSamples;

import java.util.HashMap;

public class countOccurrence {
    public static void main(String[] args) {
        //count number of occurrences in a sentence
        String sentence="one times one two times two and three is three times three";
        String[] arrayOfWords=sentence.split(" ");

        HashMap<String, Integer> countMap= new HashMap<>();

        for (String word : arrayOfWords) {
            if (countMap.containsKey(word))
                countMap.put(word, countMap.get(word) + 1);
            else
                countMap.put(word, 1);
        }
        System.out.println(countMap);
    }
}