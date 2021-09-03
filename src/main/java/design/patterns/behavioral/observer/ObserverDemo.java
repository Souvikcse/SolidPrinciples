package design.patterns.behavioral.observer;
/**
 * @author nayanava
 */

import design.patterns.behavioral.observer.observer.Observer;
import design.patterns.behavioral.observer.observer.impl.UserObserver;
import design.patterns.behavioral.observer.subject.Subject;
import design.patterns.behavioral.observer.subject.impl.PhoneClient;

import java.io.*;
import java.util.Random;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new PhoneClient();

        Observer observer = new UserObserver(subject, "Arpit");
        Observer observer1 = new UserObserver(subject, "Areeb");
        Observer observer2 = new UserObserver(subject, "Siddharth");
        Observer observer3 = new UserObserver(subject, "Jayanta");

        subject.setState("One plus 9 now available");

        for(int i = 0; i <= 3; i++)
        System.out.println(new Random().ints(1, 5, 11).findFirst().getAsInt());

        byte b = 3;
        int c = 100;
        int a = c >> b * 3;
        System.out.println(a + " " + b);
    }
}
