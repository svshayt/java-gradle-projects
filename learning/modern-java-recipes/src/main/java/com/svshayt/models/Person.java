package com.svshayt.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;

    // Копирующий конструктор класса Person
    public Person(Person p) {
        this.name = p.name;
    }
}

