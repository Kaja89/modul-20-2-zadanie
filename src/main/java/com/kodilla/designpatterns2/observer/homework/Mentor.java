package com.kodilla.designpatterns2.observer.homework;

import java.util.ArrayDeque;

public class Mentor implements Observer {

    private String firstName;
    private String lastName;
    private ArrayDeque<Observable> homeworks;
    private int updates = 0;

    public Mentor(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        homeworks = new ArrayDeque<>();
    }

    @Override
    public void update(Homework homework) {
        homeworks.offer(homework);
        System.out.println("Mentor " + getFirstName() + "! New homework: " + homework.getName() + " has been send. You have now " + homeworks.size() + " to check");
        updates++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayDeque<Observable> getHomeworks() {
        return homeworks;
    }

    public int getUpdates() {
        return updates;
    }
}
