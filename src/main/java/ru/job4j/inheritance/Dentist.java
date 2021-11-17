package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int medicineRating;

    public Dentist() {

    }

    public Dentist(String name, String surname, String education,
                   String birthday, String work, int medicineRating) {
        super(name, surname, education, birthday, work);
        this.medicineRating = medicineRating;
    }

    public int getMedicineRating() {
        return this.medicineRating;
    }

    public int whitenTeeth(int pacient) {
        int rsl = pacient;
        return pacient;
    }
}
