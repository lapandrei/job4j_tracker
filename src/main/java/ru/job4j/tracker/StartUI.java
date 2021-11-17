package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item obj = new Item();
        LocalDateTime currentDateTime = obj.getCreated();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd - MMMM - EEEE - yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущая дата и время : " + currentDateTimeFormat);
    }
}
