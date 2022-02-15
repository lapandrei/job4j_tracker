package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class JobDescByPriorityTest {

    @Test
    public void compare() {
        Comparator<Job> JobDescByPriority = new JobDescByPriority();
        int rsl = JobDescByPriority.compare(new Job("Andrei", 1), new Job("Vladimir", 2));
        assertThat(rsl, greaterThan(0));
    }
}