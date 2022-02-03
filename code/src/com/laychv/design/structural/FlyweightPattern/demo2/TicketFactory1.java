package com.laychv.design.structural.FlyweightPattern.demo2;

public class TicketFactory1 {
    public static Ticket getTicket(String from, String to) {
        return new TrainTicket(from, to);
    }
}
