package com.kodilla.designpatterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {
    private String name;
    private List<Observer> mentors;
    private ArrayDeque<String> homeworks;

    public Homework(String name) {
        //super();
        this.name = name;
        mentors = new ArrayList<>();
        homeworks = new ArrayDeque<>();
    }

    public String getName() {
        return name;
    }

    public List<Observer> getMentors() {
        return mentors;
    }

    public ArrayDeque<String> getHomeworks() {
        return homeworks;
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }

    public void addHomework(String homework) {
        homeworks.offer(homework);
        notifyObserver();
    }


}
