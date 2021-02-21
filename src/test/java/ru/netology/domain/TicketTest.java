package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketTest {
    private Ticket first = new Ticket(1001, 14500, 180, "MOW", "VRN");
    private Ticket second = new Ticket(1002, 11500, 170, "MOW", "VRN");
    private Ticket third = new Ticket(1003, 19900, 240, "STA", "BAR");
    private Ticket forth = new Ticket(1004, 31500, 480, "POR", "MOW");
    private Ticket fifth = new Ticket(1005, 18500, 120, "MOW", "VRN");
    private Ticket sixth = new Ticket(1006, 12500, 150, "MOW", "VRN");
    private Ticket seventh = new Ticket(1007, 14500, 180, "MOW", "VRN");

    @Test
    public void shouldSortByPrice() {
        Ticket[] expected = new Ticket[]{second, sixth, first, seventh, fifth, third, forth};
        Ticket[] actual = new Ticket[]{first, second, third, forth, fifth, sixth, seventh};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
