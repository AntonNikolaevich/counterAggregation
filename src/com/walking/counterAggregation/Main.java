package com.walking.counterAggregation;

import static com.walking.counterAggregation.CounterService.*;

public class Main {
    public static void main(String[] args) {
        Counter gas = new Counter("Газ", "м/куб", 50);
        Counter hotWater = new Counter("Горячая вода", "м/куб");
        Counter coldWater = new Counter("Холодная вода", "м/куб");


        addCounter(gas);
        addCounter(hotWater);
        addCounter(coldWater);


        printCounters();
        resetCounter(gas);
        increment(hotWater);
        increase(coldWater, 10);
        System.out.println(getCounter(gas));

    }

    private static void printCounters() {
        for (int i = 0; i < index; i++) {
            System.out.println(counters[i].getName() + ": " + counters[i].getCounter());
        }
    }

}
