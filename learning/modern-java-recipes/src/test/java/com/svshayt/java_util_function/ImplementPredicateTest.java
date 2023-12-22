package com.svshayt.java_util_function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ImplementPredicateTest {
    private ImplementPredicate demo = new ImplementPredicate();
    private String[] names;

    @BeforeEach
    void setUp() {
        names = Stream.of("Mal", "Wash", "Kaylee", "Inara", "Zoё",
                        "Jayne", "Simon", "River", "Shepherd Book")
                .sorted()
                .toArray(String[]::new);
    }

    @Test
    void getNamesOfLength5() {
        assertEquals("Inara, Jayne, River, Simon",
                demo.getNamesOfLength(5, names));
    }

    @Test
    void getNamesStartingWithS() {
        assertEquals("Shepherd Book, Simon",
                demo.getNamesStartingWith("S", names));
    }

    @Test
    void getNamesSatisfyingCondition() {
        assertEquals("Inara, Jayne, River, Simon",
                demo.getNamesSatisfyingCondition(ImplementPredicate.LENGTH_FIVE, names));

        assertEquals("Shepherd Book, Simon",
                demo.getNamesSatisfyingCondition(ImplementPredicate.STARTS_WITH_S, names));
    }

    @Test
    void composePredicate() {
        assertEquals("Simon",
                demo.getNamesSatisfyingCondition(
                        ImplementPredicate.LENGTH_FIVE.and(ImplementPredicate.STARTS_WITH_S), // Композиция
                        names
                ));

        assertEquals("Inara, Jayne, River, Shepherd Book, Simon",
                demo.getNamesSatisfyingCondition(
                        ImplementPredicate.STARTS_WITH_S.or(ImplementPredicate.LENGTH_FIVE), // Композиция
                        names
                ));

        assertEquals("Kaylee, Mal, Shepherd Book, Wash, Zoё",
                demo.getNamesSatisfyingCondition(
                        ImplementPredicate.LENGTH_FIVE.negate(), // Отрицание
                        names
                ));
    }
}