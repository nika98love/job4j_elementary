package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSum4To12Then72() {
        int start = 4;
        int finish = 12;
        int result = Counter.sum(start, finish);
        int expected = 72;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum3To2Then3() {
        int start = 4;
        int finish = 19;
        int result = Counter.sum(start, finish);
        int expected = 184;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum18To2Then0() {
        int start = 18;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}