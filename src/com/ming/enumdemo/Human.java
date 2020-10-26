package com.ming.enumdemo;

public class Human {
    private String name;
    private Enum<Status> status;

    public Human() {
    }

    public Human(String name, Enum<Status> status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<Status> getStatus() {
        return status;
    }

    public void setStatus(Enum<Status> status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
