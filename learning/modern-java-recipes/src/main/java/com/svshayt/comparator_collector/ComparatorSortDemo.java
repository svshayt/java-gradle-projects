package com.svshayt.comparator_collector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorSortDemo {
    private List<String> sampleStrings =
            Arrays.asList("this", "is", "a", "list", "of", "strings");

    public static void main(String[] args) {
        var demo = new ComparatorSortDemo();
        System.out.println(demo.defaultSort());
        System.out.println(demo.defaultSortUsingStreams());
    }

    // Сортировка строк в лексикографическом порядке
    public List<String> defaultSort() {
        Collections.sort(sampleStrings); // Сортировка по умолчанию, принятая в Java 7 и предыдущих версиях
        return sampleStrings;
    }

    // Сортировка строк в лексикографическом порядке
    public List<String> defaultSortUsingStreams() {
        return sampleStrings.stream()
                .sorted() // Сортировка по умолчанию, принятая в Java 8 и последующих версиях
                .collect(Collectors.toList());
    }
}
