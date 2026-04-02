package com.gla.multithreading.support;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;

public class SupportTicketThread extends Thread {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final Map<Integer, LongAdder> TOTAL_BY_PRIORITY = new ConcurrentHashMap<>();
    private static final Map<Integer, LongAdder> COUNT_BY_PRIORITY = new ConcurrentHashMap<>();

    private final int ticketId;
    private final String ticketType;
    private final long processingMillis;

    public SupportTicketThread(int ticketId, String ticketType, int priority) {
        super("Ticket-Worker-" + ticketId);
        this.ticketId = ticketId;
        this.ticketType = ticketType;
        this.processingMillis = ThreadLocalRandom.current().nextLong(1000, 5001);
        setPriority(priority);
    }

    @Override
    public void run() {
        long startMillis = System.currentTimeMillis();
        String startTime = LocalTime.now().format(FORMATTER);

        System.out.printf("[%s] Ticket ID: %d | Type: %s | Thread: %s | Priority: %d | Status: Processing started%n",
                startTime, ticketId, ticketType, getName(), getPriority());

        try {
            Thread.sleep(processingMillis);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Ticket interrupted: " + ticketId);
            return;
        }

        long endMillis = System.currentTimeMillis();
        String endTime = LocalTime.now().format(FORMATTER);
        long totalProcessing = endMillis - startMillis;

        recordStats(getPriority(), totalProcessing);

        System.out.printf("[%s] Ticket ID: %d | Type: %s | Thread: %s | Priority: %d | Status: Completed | Start: %s | End: %s | Total: %d ms%n",
                endTime, ticketId, ticketType, getName(), getPriority(), startTime, endTime, totalProcessing);
    }

    private static void recordStats(int priority, long durationMillis) {
        TOTAL_BY_PRIORITY.computeIfAbsent(priority, value -> new LongAdder()).add(durationMillis);
        COUNT_BY_PRIORITY.computeIfAbsent(priority, value -> new LongAdder()).increment();
    }

    public static void printAverageProcessingTimes() {
        System.out.println("\nAverage Processing Time Per Priority:");
        COUNT_BY_PRIORITY.keySet().stream()
                .sorted((p1, p2) -> Integer.compare(p2, p1))
                .forEach(priority -> {
                    long total = TOTAL_BY_PRIORITY.get(priority).sum();
                    long count = COUNT_BY_PRIORITY.get(priority).sum();
                    double average = count == 0 ? 0 : (double) total / count;
                    System.out.printf("Priority %d -> %.2f ms (%d tickets)%n", priority, average, count);
                });
    }
}
