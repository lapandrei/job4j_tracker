package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaBasics = new Book("Основы Джава", 650);
        Book cleanCode = new Book("Clean code", 1560);
        Book javaForBeginners = new Book("Джава для начинающих", 756);
        Book advancedJava = new Book("Грокаем алгоритмы", 350);
        Book[] books = new Book[4];
        books[0] = javaBasics;
        books[1] = cleanCode;
        books[2] = javaForBeginners;
        books[3] = advancedJava;

        for (Book ob : books) {
            System.out.println("Книга " + ob.getName() + " количество страниц "
                    + ob.getNumberOfPages());
        }
        System.out.println();
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (Book ob : books) {
            System.out.println("Книга " + ob.getName() + " количество страниц "
                    + ob.getNumberOfPages());
        }
        System.out.println();
        for (Book ob : books) {
            if (ob.getName().equals("Clean code")) {
                System.out.println(ob.getName());
            }
        }
    }
}
