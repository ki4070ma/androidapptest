package com.example.atsushi.myapplication3;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by atsushi on 2015/12/20.
 */
public class FooTest {

    @Test
    public void testCalculateFizzBuzz() throws Exception {
        String result = Foo.calculateFizzBuzz(1);
        assertEquals("0", result);
    }
}