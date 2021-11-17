package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private boolean fortranDeveloper;

    public Programmer() {

    }

    public Programmer(String name, String surname, String education, String birthday, String work,
                      boolean fortranDeveloper) {
        super(name, surname, education, birthday, work);
        this.fortranDeveloper = fortranDeveloper;
    }

    public boolean getFortranDeveloper() {
        return this.fortranDeveloper;
    }

    public String buildAlgo(String title) {
        String rsl = title;
        return rsl;
    }

}
