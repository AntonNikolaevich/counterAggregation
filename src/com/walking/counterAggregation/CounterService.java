package com.walking.counterAggregation;

public class CounterService {
    static Counter[] counters = new Counter[10];
    static int index = 0;

    public static void addCounter(Counter counter) {
        counters[index] = counter;
        index++;
    }

    public static void getCounters() {
        int sizeOfArray = index;
        for (int i = 0; i < sizeOfArray; i++) {

            System.out.println(counters[i].getName());
        }

    }

    public static void resetCounter(Counter counter) {
        counter.setCounter(0);
    }

    public static void increment(Counter counter) {
        counter.setCounter(counter.getCounter() + 1);
    }

    public static void increase(Counter counter, int number) {
        counter.setCounter(counter.getCounter() + number);
    }

    public static int getCounter(Counter counter) {
        return counter.getCounter();
    }
}
