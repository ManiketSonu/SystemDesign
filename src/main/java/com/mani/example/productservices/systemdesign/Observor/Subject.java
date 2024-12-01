package com.mani.example.productservices.systemdesign.Observor;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
