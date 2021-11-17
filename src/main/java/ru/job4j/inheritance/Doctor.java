package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String work;

    public Doctor() {

    }

    public Doctor(String name, String surname, String education, String birthday, String work) {
        super(name, surname, education, birthday);
        this.work = work;
    }

    public String getWork() {
        return this.work;
    }

    public Doctor heal(Engineer pacient) {
        Doctor ob = new Doctor();
        return ob;
    }
}
