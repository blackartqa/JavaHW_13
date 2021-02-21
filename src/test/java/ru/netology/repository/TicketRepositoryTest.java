package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.manager.TicketManager;

public class TicketRepositoryTest {
        private TicketManager repository = new TicketManager();
        private Ticket first = new Ticket(1001, 14500, 180, "MOW", "VRN");
        private Ticket second = new Ticket(1002, 11500, 170, "MOW", "VRN");
        private Ticket third = new Ticket(1003, 19900, 240, "STA", "BAR");
        private Ticket forth = new Ticket(1004, 31500, 480, "POR", "MOW");
        private Ticket fifth = new Ticket(1005, 18500, 120, "MOW", "VRN");
        private Ticket sixth = new Ticket(1006, 12500, 150, "MOW", "VRN");
        private Ticket seventh = new Ticket(1007, 14500, 180, "MOW", "VRN");

        @BeforeEach

        public void setUp(){
            repository.add(first);
            repository.add(second);
            repository.add(third);
            repository.add(forth);
            repository.add(fifth);
            repository.add(sixth);
            repository.add(seventh);
        }
        @Test
        void shouldSearchByAirport(){
            String departureAirportName = "MOW";
            String arrivalAirportName = "VRN";
            Ticket[] expected = new Ticket[]{second, sixth, first, seventh, fifth};
            Ticket[] actual = repository.findByAirport(departureAirportName, arrivalAirportName);
        }
    }
