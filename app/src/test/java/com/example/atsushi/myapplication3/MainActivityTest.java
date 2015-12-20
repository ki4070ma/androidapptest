package com.example.atsushi.myapplication3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by atsushi on 2015/12/20.
 */
public class MainActivityTest {

    @Test
    public void testCalculateFizzBuzz2() throws Exception {
        String result = MainActivity.calculateFizzBuzz2(1);
        assertEquals("1", result);
    }

    @Test
    public void testCalculateFizzBuzz2_2() {
        String result = MainActivity.calculateFizzBuzz2(2);
        assertEquals("2", result);
    }

    @Test
    public void testCalculateFizzBuzz2_3() {
        String result = MainActivity.calculateFizzBuzz2(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void testCalculateFizzBuzz2_4() {
        String result = MainActivity.calculateFizzBuzz2(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testCalculateFizzBuzz2_5() {
        String result = MainActivity.calculateFizzBuzz2(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void testCalculateFizzBuzz2_6() {
        String result = MainActivity.calculateFizzBuzz2(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testCalculateFizzBuzz2_7() {
        String result = MainActivity.calculateFizzBuzz2(30);
    }

}