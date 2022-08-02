package ru.job4j.lambda;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class FunctionUsageTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionUsage.diapason(5, 8, x -> (2 * x) + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        List<Double> result = FunctionUsage.diapason(2, 5, x -> (x * x) + 1);
        List<Double> expected = Arrays.asList(5D, 10D, 17D, 26D);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {

        List<Double> result = FunctionUsage.diapason(0, 2, x -> Math.pow(2, x) - 1);
        List<Double> expected = Arrays.asList(0D, 1D, 3D);
        assertThat(result).isEqualTo(expected);
    }
}