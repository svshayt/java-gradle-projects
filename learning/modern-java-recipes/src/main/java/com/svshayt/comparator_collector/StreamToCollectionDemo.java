package com.svshayt.comparator_collector;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollectionDemo {

    public static void main(String[] args) {
        // Создание списка
        List<String> superHeroes =
                Stream.of("Mr. Furious", "The Blue Raja", "The Shoveler",
                                "The Bowler", "Invisible Boy", "The Spleen", "The Sphinx")
                        .collect(Collectors.toList());
        System.out.println(superHeroes);

        // Создание множества
        Set<String> villains =
                Stream.of("Casanova Frankenstein", "The Disco Boys",
                                "The Not-So-Goodie Mob", "The Suits", "The Suzies",
                                "The Furriers", "The Furriers") // Повторяющееся имя, в процессе преобразования во множество удаляется
                        .collect(Collectors.toSet());
        System.out.println(villains);
    }
}
