package design.patterns.behavioral.observer.subject.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.observer.subject.Subject;

public class PhoneClient extends Subject<String> {
    private String message;

    @Override
    public String getState() {
        return this.message;
    }

    @Override
    public void setState(String message) {
        this.message = message;
        this.notifyObservers();
    }
}
