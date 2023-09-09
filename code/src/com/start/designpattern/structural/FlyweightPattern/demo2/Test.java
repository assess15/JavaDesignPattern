package com.start.designpattern.structural.FlyweightPattern.demo2;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = TicketFactory1.getTicket("杭州", "六安");
        ticket.showTicketInfo("坐票");

        Ticket ticket1 = TicketFactory2.getTicket("六安", "杭州");
        ticket1.showTicketInfo("无坐");

        Ticket ticket3 = TicketFactory2.getTicket("六安", "杭州");
        ticket3.showTicketInfo("无坐");
    }
}
