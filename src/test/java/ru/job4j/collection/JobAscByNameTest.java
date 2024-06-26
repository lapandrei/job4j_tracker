package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class JobAscByNameTest {

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> jobAscByName = new JobAscByName();
        int rsl = jobAscByName.compare(new Job("Igor", 1), new Job("Andrei", 2));
        assertThat(rsl, greaterThan(0));
    }

}