package com.elbrus.entity;

public class Stock {
    private final String ric;
    private final String name;

    public Stock(String ric, String name) {
        this.ric = ric;
        this.name = name;
    }

    public String getRic() {
        return ric;
    }

    public String getName() {
        return name;
    }
}
