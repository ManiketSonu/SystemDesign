package com.mani.example.productservices.systemdesign.Observor;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        // Change the state of the subject, which will notify observers
        subject.setState("State 1");
        subject.setState("State 2");

        // Detach an observer and change the state again
        subject.detach(observer1);
        subject.setState("State 3");
    }
}
