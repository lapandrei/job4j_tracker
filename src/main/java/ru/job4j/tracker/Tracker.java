package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                itemsWithoutNull[size] = items[i];
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[items.length];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getName().equals(key)) {
                itemsByName[size] = items[i];
                size++;
            }
        }
        itemsByName = Arrays.copyOf(itemsByName, size);
        return itemsByName;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        } else {
            item.setId(id);
            items[index] = item;
            return true;
        }
    }
}