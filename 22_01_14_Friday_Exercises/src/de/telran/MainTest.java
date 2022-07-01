package de.telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private Main m;

    @BeforeEach
    public void init() {
        m = new Main();
    }

    public void yesOrNo_test_empty() {
        assertEquals(Arrays.asList(), m.yesOrNot(Arrays.asList(), Arrays.asList()));

        @Test
        public void yesOrNo_test_oneElt () {

            List<|String > expected = Arrays.asList("No");
            List<|String > actuel1 = Arrays.asList(1);
            List<|String > actuel2 = Arrays.asList(5);

            assertEquals(expected);
        }

        private void assertEquals (List < Object > asList, List < String > yesOrNot){
        }


    }
    @Test
    public void shorTestOrLongest_emptyList_throwEmptyListException() {
        asserThrows(EmptyListException.class, () ->.shortestOrLongest(Arrays.asList("a")));
    }

        @Test
        public void shorTestOrLongest_short_ElementFirst() {
            assertEquals("a", m.shortestOrLongest(Arrays.asList("bb", "aaa", "ff", "d")));
        }

        @Test
        public void shorTestOrLongest_longest_ElementFirst() {
            assertEquals("aaa", m.shortestOrLongest(Arrays.asList("bb", "aaa", "ff", "d")));

        }

    @Test
    public void balancedBreackets_Test_two_rownd_square_two_more() {
        String str = "([{}])";
        assertTrue(m.balancesBreackets(str));
    }
    @Test
    public void balancedBreackets_Test_two_wrong() {
        String str = "(([{])";
        assertFalse(m.balancesBreackets(str));
    }
    @Test
    public void balancedBreackets_Test_with_letters() {
        String str = "([{b}drft]a)";
        assertTrue(m.balancesBreackets(str));
    }
    @Test
    public void balancedBreackets_Test_() {
        String str = "([{b}drft]a)";
        assertTrue(m.balancesBreackets(str));
    }
    }
