package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then1() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3To4Then2() {
        int left = 3;
        int right = 3;
        int left1 = 4;
        int result = Max.max(left, Max.max(right, left1));
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3To4To5Then2() {
        int left = 3;
        int right = 3;
        int left1 = 4;
        int right1 = 5;
        int result = Max.max(left, Max.max(right, left1, right1));
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then2() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
}