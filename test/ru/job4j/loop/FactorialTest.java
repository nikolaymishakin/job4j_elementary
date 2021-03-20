package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int i = 5;
        int result = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int i = 0;
        int result = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int i = 1;
        int result = Factorial.calc(1);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}