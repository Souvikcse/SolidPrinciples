package design.patterns.behavioral.observer.observer;
/**
 * @author nayanava
 */

import design.patterns.behavioral.observer.subject.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
