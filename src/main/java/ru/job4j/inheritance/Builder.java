package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int finishedProject;

    public Builder() {

    }

    public Builder(String name, String surname, String education, String birthday, String work,
                      int finishedProject) {
        super(name, surname, education, birthday, work);
        this.finishedProject = finishedProject;
    }

    public int getFortranDeveloper() {
        return this.finishedProject;
    }

    public boolean buildHouse(String title) {
        boolean rsl = false;
        return rsl;
    }
}
