package com.example.java8features.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    public static List<String> filterNamesStartingWith(List<String> names, String prefix) {
        return names.stream()
                    .filter(name -> name.startsWith(prefix))
                    .collect(Collectors.toList());
    }

    public static List<Integer> squareEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .map(n -> n * n)
                      .collect(Collectors.toList());
    }

    public static int sumOfList(List<Integer> numbers) {
        return numbers.stream()
                      .reduce(0, Integer::sum); // sum via reduce
    }

    public static Map<String, Long> countWords(List<String> words) {
        return words.stream()
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    }
}
// This class demonstrates various Stream API operations in Java 8.
// It includes methods to filter names starting with a specific prefix, square even numbers,
// compute the sum of a list, and count occurrences of words in a list.
// The methods utilize functional programming concepts such as filtering, mapping, and reducing.