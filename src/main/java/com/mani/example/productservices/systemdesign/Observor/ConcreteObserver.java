package com.mani.example.productservices.systemdesign.Observor;

public class ConcreteObserver implements Observer {
    private String observerState;
    private ConcreteSubject subject;

    // Constructor with subject passed in
    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.attach(this);  // Register this observer with the subject
    }

    // Update the observer's state
    @Override
    public void update(String message) {
        this.observerState = message;  // Update observer's state with new message
        System.out.println("Observer state updated to: " + observerState);
    }
}
