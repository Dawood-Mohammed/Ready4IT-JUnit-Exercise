package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends TestCase {

    @Test
    public void testSubtraction() {
        System.out.println("Asserting if 20 subtracted by 10 equals 10, which is true");
        Assert.assertEquals(Main.subtraction(20, 10), 10);
    }
    @Test
    public void testSubtractionForFailure() {
        System.out.println("Asserting if 10 subtracted by 100 equals 18, which is false");
        Assert.assertEquals(Main.subtraction(10, 100), 18);
    }
    @Test
    public void testMultiplication() {
        System.out.println("Asserting if 20 multiplied by 10 equals 200, which is true");
        Assert.assertEquals(Main.multiplication(20, 10), 200);
    }
    @Test
    public void testMultiplicationForFailure() {
        System.out.println("Asserting if 21 multiplied by 1 equals 15, which is false");
        Assert.assertEquals(Main.multiplication(21, 1), 15);
    }
}