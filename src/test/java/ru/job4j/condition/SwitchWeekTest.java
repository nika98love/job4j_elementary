package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwitchWeekTest {

    @Test
    void when3thenWednesday() {
        int day = 3;
        String rsl = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        assertEquals(expected, rsl);
    }

    @Test
    void when1thenMonday() {
        int day = 1;
        String rsl = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertEquals(expected, rsl);
    }

    @Test
    void when9thenError() {
        int day = 9;
        String rsl = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertEquals(expected, rsl);
    }
}