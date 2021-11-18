package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int medicineRating;

    public Surgeon(String name, String surname, String education,
                   String birthday, String work, int medicineRating) {
        super(name, surname, education, birthday, work);
        this.medicineRating = medicineRating;
    }

    public int getMedicineRating() {
        return this.medicineRating;
    }

    public int removeAppendicitis(int pacient) {
        int rsl = pacient;
        return rsl;
    }
}
