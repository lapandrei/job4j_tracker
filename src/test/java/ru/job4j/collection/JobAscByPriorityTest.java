package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class JobAscByPriorityTest {

    @Test
    public void compare() {
        Comparator<Job> jobAscByPriority = new JobAscByPriority();
        int rsl = jobAscByPriority.compare(new Job("Igor", 2), new Job("Andrei", 1));
        assertThat(rsl, greaterThan(0));
    }
}