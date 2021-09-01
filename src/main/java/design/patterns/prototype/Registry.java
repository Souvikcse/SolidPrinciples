//package design.patterns.prototype;
///**
// * @author nayanava
// */
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Registry {
//    private Map<String, Item> items = new HashMap<>();
//
//    public Registry() {
//        loadItems();
//    }
//
//    public Item createItem(String type) {
//
//    }
//
//    private void loadItems() {
//        Movie movie = new Movie();
//        movie.setTitle("Mission Impossible 2");
//        movie.setPrice(24.99);
//        movie.setRunningTime("2 hours and 30 minutes");
//
//        items.put("Movie", movie);
//
//        Book book = new Book();
//        book.setTitle("HeadFirst System Design");
//        book.setPrice(24.99);
//        book.setNumberOfPages(100);
//    }
//}
