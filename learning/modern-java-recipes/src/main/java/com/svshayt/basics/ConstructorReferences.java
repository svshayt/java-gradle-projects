package com.svshayt.basics;

import com.svshayt.models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferences {
    public static void main(String[] args) {
        // Преобразование списка людей в список имен
        List<Person> people = new ArrayList<>();
        List<String> names = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());
        // или
        List<String> namesRef = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        // Преобразование строк в экземпляры класса Person
        List<String> stringNames = Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace", "Karen Sparck Jones");

        List<Person> lambdaPeople = stringNames.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());
        // или
        List<Person> lambdaMethodPeople = stringNames.stream()
                .map(Person::new) // Создание объекта Person с помощью ссылки на конструктор
                .collect(Collectors.toList());
        System.out.println(lambdaMethodPeople);
    }
}
