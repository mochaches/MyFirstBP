package com.github.mochachess;

import java.time.LocalDate;

public class Data {
    private final long id;
    private static long counter;
    private String name;
    private String description;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Data(String name, String description) {
        this.name = name;
        this.description = description;
        this.date = LocalDate.now();
        this.id = ++counter;
    }


}
