package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = ((Predicate<Person>) s -> s.getName().equals(key))
                .or(s -> s.getSurname().equals(key)).or(s -> s.getPhone().equals(key))
                .or(s -> s.getAddress().equals(key));
        ArrayList<Person> result = new ArrayList<>();
        for (var value : persons) {
            if (combine.test(value)) {
                result.add(value);
            }
        }
        return result;
    }
}
