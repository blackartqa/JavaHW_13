package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private int timeFlight;
    private String departureAirportName;
    private String arrivalAirportName;


    @Override
    public int compareTo(Ticket o) {
        return price - o.price;
    }
}
