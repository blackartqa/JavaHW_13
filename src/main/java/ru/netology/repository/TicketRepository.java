package ru.netology.repository;

import ru.netology.domain.Ticket;

public class TicketRepository {
    private Ticket[] items = new Ticket[0];

    public void save(Ticket item){
        int length = items.length + 1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Ticket[] findAll() {
        return items;
    }

    public Ticket[] findByAirport(String departureAirportName, String arrivalAirportName) {
        Ticket[] result = new Ticket[0];
        for(Ticket item : items) {
            if((item.getDepartureAirportName().equalsIgnoreCase(departureAirportName)) && (item.getArrivalAirportName().equalsIgnoreCase(arrivalAirportName))){
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }
        return result;
        }
    }

