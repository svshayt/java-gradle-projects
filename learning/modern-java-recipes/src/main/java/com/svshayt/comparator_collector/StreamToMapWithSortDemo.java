package com.svshayt.comparator_collector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToMapWithSortDemo {
    private Path dictionary = Paths.get("/usr/share/dict/words");

    public static void main(String[] args) {
        var demo = new StreamToMapWithSortDemo();
        System.out.println("\nРаспределение числа слов по длинам:");
        try (Stream<String> lines = Files.lines(demo.dictionary)) {
            lines.filter(s -> s.length() > 20)
                    .collect(Collectors.groupingBy(
                            String::length, Collectors.counting()))
                    .forEach((len, num) -> System.out.printf("%d: %d%n", len, num));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
