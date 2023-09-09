package com.start.designpattern.structural.FlyweightPattern.demo2;

public class TicketFactory1 {
    public static Ticket getTicket(String from, String to) {
        return new TrainTicket(from, to);
    }
}
