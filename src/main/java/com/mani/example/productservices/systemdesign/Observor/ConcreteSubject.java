package com.mani.example.productservices.systemdesign.Observor;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    // State setter
    public void setState(String state) {
        this.state = state;
        notifyObservers();  // Notify all observers of the state change
    }

    // State getter
    public String getState() {
        return state;
    }

    // Attach observer
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Detach observer
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
