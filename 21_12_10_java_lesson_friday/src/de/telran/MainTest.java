package de.telran;

public class MainTest {

    Main m = new Main();

    @Test
    public void isCycle2_test_abc_cab_true() {
        assertTrue(m.isCycle2("abc, cab"));
    }

}
