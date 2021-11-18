package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String work;

    public Engineer(String name, String surname, String education, String birthday, String work) {
        super(name, surname, education, birthday);
        this.work = work;
    }

    public String getWork() {
        return this.work;
    }

    public String makeBluePrint(String title) {
        String rsl = title;
        return rsl;
    }

}
