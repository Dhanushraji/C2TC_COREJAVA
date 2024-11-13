package com.tns.ifet.day7.queue;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");
        while (!customerQueue.isEmpty()) {
            String customer = customerQueue.poll();
            System.out.println("Serving: " + customer);
        }
    }
}