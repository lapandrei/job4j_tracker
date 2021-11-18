package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Гаррифулин Алмаз Гаптулхаевич");
        student.setGroup("ИЭ - 11");
        student.setDateOfReceipt(new Date());

        System.out.println(student.getFio() + " зачислен в группу " + student.getGroup()
                + " " + student.getDateOfReceipt());
    }
}
