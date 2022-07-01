package de.telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private Main m;

    @BeforeEach
    public void init() {
        m = new Main();

    }

    @Test
    public void getAddress_Test_empty() {
        assertEquals(Arrays.asList(), m.gettAddress(Arrays.asList()));
    }

    @Test
    public void getAddress_Test_several() {
        Address address1 = new Address("Street1", 1);
        Address address2 = new Address("Street2", 1);
        Person person1 = new Person("Person1", address1);
        Person person2 = new Person("Person2", address1);
        List<Address> expected = Arrays.asList(address1, address2);
        List<Person> actual = Arrays.asList(person1, person2);

        assertEquals(expected, m.gettAddress(actual));

    }
}
