package com.gla.multithreading.support;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SupportTicketSystemMain {

    private static final String[] TYPES = {"Critical", "Feature", "Query", "Feedback"};

    public static void main(String[] args) {
        List<SupportTicketThread> tickets = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String type = TYPES[ThreadLocalRandom.current().nextInt(TYPES.length)];
            int priority = getPriorityByType(type);
            SupportTicketThread ticketThread = new SupportTicketThread(i, type, priority);
            tickets.add(ticketThread);
        }

        for (SupportTicketThread ticket : tickets) {
            ticket.start();
        }

        for (SupportTicketThread ticket : tickets) {
            try {
                ticket.join();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                System.out.println("Support ticket system interrupted.");
                return;
            }
        }

        SupportTicketThread.printAverageProcessingTimes();
        System.out.println("Support ticket processing simulation completed.");
    }

    private static int getPriorityByType(String type) {
        if ("Critical".equalsIgnoreCase(type)) {
            return 10;
        }
        if ("Feature".equalsIgnoreCase(type)) {
            return 4;
        }
        if ("Query".equalsIgnoreCase(type)) {
            return 2;
        }
        return 1;
    }
}
