package com.start.designpattern.structural.FlyweightPattern.demo2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元模式的核心
 * 创建缓冲池
 */
public class TicketFactory2 {
    static Map<String, Ticket> ticketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-->" + to;
        if (ticketMap.containsKey(key)) {
            System.out.println("使用缓存 : ==> " + key);
            return ticketMap.get(key);
        } else {
            System.out.println("创建对象 : ==> " + key);
            TrainTicket ticket = new TrainTicket(from, to);
            ticketMap.put(key, ticket);
            return ticket;
        }
    }
}
