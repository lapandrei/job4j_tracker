package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус    : " + status);
        System.out.println("Сообщение : " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error obj1 = new Error();
        Error obj2 = new Error(true, 1, " missing statement");
        Error obj3 = new Error(false, 2, " div by zero");
        obj1.printInfo();
        obj2.printInfo();
        obj3.printInfo();
    }
}
