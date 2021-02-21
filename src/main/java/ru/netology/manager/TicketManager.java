package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;

import static java.util.Arrays.*;

public class TicketManager {
    private TicketRepository repository = new TicketRepository();

    public void add (Ticket item){
        repository.save(item);
    }

    public Ticket[] findByAirport (String departureAirportName, String arrivalAirportName){
        Ticket[] result = repository.findByAirport(departureAirportName, arrivalAirportName);
        sort(result);
        return result;
    }
}
