package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class JobDescByPriorityTest {

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> jobDescByPriority = new JobDescByPriority();
        int rsl = jobDescByPriority.compare(new Job("Andrei", 1), new Job("Vladimir", 2));
        assertThat(rsl, greaterThan(0));
    }
}