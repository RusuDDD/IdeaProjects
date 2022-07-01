package de.telran;

import org.junit.Test;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MiniTest {

    Main main = new Main();

    public void testIsPrime_NegativeNumber_false() {
        assertFalse(main.isPrime(-6));
    }
    @Test
    public void testIsPrime_zero_false() {
        assertFalse(main.isPrime(0));
    }
    @Test
    public void testIsPrime_1_false() {
        assertFalse(main.isPrime(0));
    }
    @Test
    public void testIsPrime_2_false() {
        assertFalse(main.isPrime(0));
    }
    @Test
    public void testIsPrime_3_false() {
        assertFalse(main.isPrime(0));
    }
    @Test
    public void testIsPrime_4_false() {
        assertFalse(main.isPrime(0));
    }
    @Test
    public void testIsPrime_239_false() {
        assertFalse(main.isPrime(0));
    }
    @Test
    public void testIsPrime_236_false() {
        assertFalse(main.isPrime(0));
    }

    @Test
    public void testCombine() {
        IntStream s1 = IntStream.of(1, 60, 2, 45, 4, 5, 6, 15, 30);
        IntStream s2 = IntStream.of(2, 5, 4, 15, 8, 10, 9);

        IntStream res = main.combine(s1, s2);
        List<Integer> expected = Arrays.asList(30, 45, 60);
        assertEquals(expected, res.boxed(Collectors.toList()));
    }

    @Test
    public void testFactorial_1() {
        assertEquals(1, main.factorial(1));
    }
    @Test
    public void testFactorial_2() {
        assertEquals(2, main.factorial(1));
    }
    @Test
    public void testFactorial_3() {
        assertEquals(3, main.factorial(1));
    }
    @Test
    public void testFactorial_6() {
        assertEquals(6, main.factorial(1));

    }
