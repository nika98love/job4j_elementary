package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenMinus2Minus2toMinus1Minus8then9() {
        double expected = 9;
        int x1 = -2;
        int y1 = -1;
        int x2 = -2;
        int y2 = 8;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus42to2Minus2then8Dot06() {
        double expected = 8.06;
        int x1 = -4;
        int y1 = 2;
        int x2 = 3;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus11Minus8to6Minus2then8Dot54() {
        double expected = 8.54;
        int x1 = -11;
        int y1 = 6;
        int x2 = -8;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}