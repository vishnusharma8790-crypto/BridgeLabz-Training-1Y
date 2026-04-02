package com.gla.multithreading.examhall;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExamHallManagementMain {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static volatile boolean examActive = true;

    public static void main(String[] args) {
        Thread entryMonitoringThread = new Thread(new EntryMonitoringTask(), "Entry-Monitoring-Thread");
        Thread questionPaperThread = new Thread(new QuestionPaperTask(), "Question-Paper-Thread");
        Thread attendanceThread = new Thread(new AttendanceTask(), "Attendance-Thread");
        Thread collectionThread = new Thread(new CollectionTask(), "Collection-Thread");

        questionPaperThread.setPriority(10);
        attendanceThread.setPriority(8);
        entryMonitoringThread.setPriority(5);
        collectionThread.setPriority(7);

        printState("Before start", entryMonitoringThread, questionPaperThread, attendanceThread, collectionThread);

        entryMonitoringThread.start();
        questionPaperThread.start();
        attendanceThread.start();
        collectionThread.start();

        // Let threads run so sleep-based tasks move to TIMED_WAITING.
        sleepSafely(1500);
        printState("During execution", entryMonitoringThread, questionPaperThread, attendanceThread, collectionThread);

        try {
            collectionThread.join();
            entryMonitoringThread.join();
            questionPaperThread.join();
            attendanceThread.join();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Exam hall simulation interrupted.");
            return;
        }

        printState("After completion", entryMonitoringThread, questionPaperThread, attendanceThread, collectionThread);
        System.out.println("Exam hall management simulation completed.");
    }

    private static void printState(String phase, Thread... threads) {
        System.out.println("\n[" + LocalTime.now().format(FORMATTER) + "] " + phase + " thread states:");
        for (Thread thread : threads) {
            System.out.printf("Thread: %s | Priority: %d | State: %s%n",
                    thread.getName(),
                    thread.getPriority(),
                    thread.getState());
        }
    }

    private static void sleepSafely(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    static class EntryMonitoringTask implements Runnable {
        @Override
        public void run() {
            while (examActive) {
                System.out.printf("[%s] Thread: %s | Priority: %d | Activity: Monitoring student entry%n",
                        LocalTime.now().format(FORMATTER),
                        Thread.currentThread().getName(),
                        Thread.currentThread().getPriority());
                sleepSafely(1000);
            }
            System.out.printf("[%s] Thread: %s | Activity: Entry monitoring closed%n",
                    LocalTime.now().format(FORMATTER),
                    Thread.currentThread().getName());
        }
    }

    static class QuestionPaperTask implements Runnable {
        @Override
        public void run() {
            sleepSafely(5000);
            System.out.printf("[%s] Thread: %s | Priority: %d | Activity: Question paper distributed%n",
                    LocalTime.now().format(FORMATTER),
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority());
        }
    }

    static class AttendanceTask implements Runnable {
        @Override
        public void run() {
            sleepSafely(10000);
            System.out.printf("[%s] Thread: %s | Priority: %d | Activity: Attendance started%n",
                    LocalTime.now().format(FORMATTER),
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority());
        }
    }

    static class CollectionTask implements Runnable {
        @Override
        public void run() {
            sleepSafely(15000);
            System.out.printf("[%s] Thread: %s | Priority: %d | Activity: Collecting answer sheets%n",
                    LocalTime.now().format(FORMATTER),
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority());
            examActive = false;
        }
    }
}
