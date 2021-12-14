package com.jk.java.map;

import java.util.HashMap;
import java.util.Map;

public class NearestRepeatedEntries {
    public static void main(String[] args) {
        String[] words = new String[]{ "play", "play", "Work", "and", "no",  "play", "makes", "for", "no", "word", "no", "fun", "and", "no", "result", "play"};
        System.out.println(distanceOfClosestRepeatedEntries(words));
    }

    private static int distanceOfClosestRepeatedEntries(String[] sentence) {
        Map<String, Integer> wordToIndexLastSeenAt = new HashMap<>();
        int nearestRepeatedEntryDistance = Integer.MAX_VALUE;

        for (int i = 0; i < sentence.length; i++) {
            String word = sentence[i];

            if (wordToIndexLastSeenAt.containsKey(word)) {
                int lastAppearanceIndex = wordToIndexLastSeenAt.get(word);
                int distanceToLastAppearance = i - lastAppearanceIndex;

                nearestRepeatedEntryDistance = Math.min(nearestRepeatedEntryDistance, distanceToLastAppearance);
            }

            wordToIndexLastSeenAt.put(word, i);
        }

        return nearestRepeatedEntryDistance == Integer.MAX_VALUE ? -1 : nearestRepeatedEntryDistance;
    }

}
