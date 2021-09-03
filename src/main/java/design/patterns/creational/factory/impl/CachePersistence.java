package design.patterns.creational.factory.impl;
/**
 * @author nayanava
 */

import design.patterns.creational.factory.Persistence;

public class CachePersistence<T> implements Persistence<T> {
    @Override
    public void save(T data) {
        System.out.println("Data is written to cache");
    }

    @Override
    public void fetch(String id) {
        System.out.println("Data is fetched from cache");
    }

    @Override
    public void update(T data) {
        System.out.println("Data has been updated in cache");
    }

    @Override
    public void delete(String id) {
        System.out.println("Data has been deleted cache");
    }
}
