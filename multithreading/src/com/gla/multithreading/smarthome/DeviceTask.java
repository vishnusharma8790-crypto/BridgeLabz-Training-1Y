package com.gla.multithreading.smarthome;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DeviceTask implements Runnable {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    private final String deviceName;
    private final int cycleDelayMillis;
    private final int totalCycles;

    public DeviceTask(String deviceName, int cycleDelayMillis, int totalCycles) {
        this.deviceName = deviceName;
        this.cycleDelayMillis = cycleDelayMillis;
        this.totalCycles = totalCycles;
    }

    @Override
    public void run() {
        for (int cycle = 1; cycle <= totalCycles; cycle++) {
            System.out.printf(
                    "[%s] Device: %s | Thread: %s | Priority: %d | Status: Cycle %d/%d active%n",
                    LocalTime.now().format(FORMATTER),
                    deviceName,
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority(),
                    cycle,
                    totalCycles
            );

            try {
                Thread.sleep(cycleDelayMillis);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                System.out.println(deviceName + " interrupted.");
                return;
            }
        }

        System.out.printf("[%s] Device: %s | Status: Completed all cycles%n",
                LocalTime.now().format(FORMATTER),
                deviceName
        );
    }
}
