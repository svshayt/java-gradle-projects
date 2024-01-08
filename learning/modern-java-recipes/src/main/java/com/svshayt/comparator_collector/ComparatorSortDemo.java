package com.svshayt.comparator_collector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ComparatorSortDemo {
    private List<String> sampleStrings =
            Arrays.asList("this", "is", "a", "list", "of", "strings");

    public static void main(String[] args) {
        var demo = new ComparatorSortDemo();
        System.out.println(demo.defaultSort());
        System.out.println(demo.defaultSortUsingStreams());

        System.out.println(demo.lengthSortUsingSorted());
        System.out.println(demo.lengthSortUsingComparator());
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
                .collect(toList());
    }

    // Сортировка строк по длине
    public List<String> lengthSortUsingSorted() {
        return sampleStrings.stream()
                .sorted((s1, s2) -> s1.length() - s2.length()) // Лямбда-выражение в качестве компаратора для сортировки по длине
                .collect(toList());
    }

    // Сортировка строк по длине
    public List<String> lengthSortUsingComparator() {
        return sampleStrings.stream()
                .sorted(Comparator.comparingInt(String::length)) // Метод comparingInt в качестве компаратора
                .collect(toList());
    }
}
