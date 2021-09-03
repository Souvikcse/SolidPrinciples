package design.patterns.behavioral.observer.observer.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.observer.observer.Observer;
import design.patterns.behavioral.observer.subject.Subject;

public class UserObserver extends Observer {

    private String name;
    public UserObserver(Subject subject, String name) {
        super.subject = subject;
        this.name = name;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("Hi %s, There is a state change for %s", this.name, subject.getState()));
    }
}
