package com.example.collections.frequency;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static Map<Character, Integer> charFrequency(String input) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        return freqMap;
    }

    public static Map<String, Integer> wordFrequency(String input) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : input.split("\\s+")) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        return freqMap;
    }
}
// Compare this snippet from Java17/src/com/example/collections/frequency/FrequencyCounterTest.java:
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;