package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Andrei"));
        items.add(new Item("Yarik"));
        items.add(new Item("Vladimir"));
        List<Item>  expected = new ArrayList<>(
                Arrays.asList(
                        new Item("Yarik"),
                        new Item("Vladimir"),
                        new Item("Andrei")
                )
        );
        Collections.sort(items, new ItemDescByName());
        assertEquals(expected, items);
    }
}