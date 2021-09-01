package design.patterns.factory.impl;
/**
 * @author nayanava
 */

import design.patterns.factory.Persistence;

import java.io.*;

public class DbPersistence<T> implements Persistence<T> {
    @Override
    public void save(T data) {
        System.out.println("Data is written to database");
    }

    @Override
    public void fetch(String id) {
        System.out.println("Data is fetched from database");
    }

    @Override
    public void update(T data) {
        System.out.println("Data has been updated in database");
    }

    @Override
    public void delete(String id) {
        System.out.println("Data has been deleted database");
    }
}
