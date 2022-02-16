package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobDescByNameTest {

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> jobDescByName = new JobDescByName();
        int rsl = jobDescByName.compare(new Job("Andrei", 0), new Job("Vladimir", 1));
        assertThat(rsl, greaterThan(0));
    }
}