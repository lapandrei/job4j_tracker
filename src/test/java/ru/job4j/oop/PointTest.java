package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 3);
        Point b = new Point(0, 3, 0);
        double result = a.distance3d(b);
        double expected = 4.2;
        assertThat(result,closeTo(expected,0.1));
    }

    @Test
    public void distance3dOne() {
        Point a = new Point(0, 0, 3);
        Point b = new Point(1, 2, -2);
        double result = a.distance3d(b);
        double expected = 5.4;
        assertThat(result,closeTo(expected,0.1));
    }
}