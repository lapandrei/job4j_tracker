package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int medicineRating;

    public Surgeon() {

    }

    public Surgeon(String name, String surname, String education,
                   String birthday, String work, int medicineRating) {
        super(name, surname, education, birthday, work);
        this.medicineRating = medicineRating;
    }

    public int getMedicineRating() {
        return this.medicineRating;
    }

    public Pacient removeAppendicitis(Pacient pacient) {
        Pacient ob = new Pacient();
        return ob;
    }
}
