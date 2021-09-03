package design.patterns.behavioral.observer.subject;
/**
 * @author nayanava
 */

import design.patterns.behavioral.observer.observer.Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Subject<T> {
    private Set<Observer> observers = new LinkedHashSet<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public abstract T getState();
    public abstract void setState(T message);

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
