package com.walking.counterAggregation;

public class Counter {
    private final String name;
    private int counter;
    private final String measure;

    public Counter(String name, String measure) {
        this.name = name;
        this.measure = measure;
        counter = 0;
    }

    protected Counter(String name, String measure, int counter) {
        this.name = name;
        this.counter = counter;
        this.measure = measure;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public String getMeasure() {
        return measure;
    }
}
