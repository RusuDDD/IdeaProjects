package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsTest {

    @Test
    public void testCompareTo_() {
        News news1 = new News("Hello World", 7);
        News news2 = new News("Hello", 7);

        assertTrue(news1.compareTo(news2) > 0);
    }

}