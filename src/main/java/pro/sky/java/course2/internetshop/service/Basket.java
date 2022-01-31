package pro.sky.java.course2.internetshop.service;

import java.util.HashMap;

public class Basket {
    HashMap<Integer, Integer> items;

    public Basket(HashMap<Integer, Integer> items) {
        this.items = new HashMap<>();
    }

    public Basket() {
    }
    public HashMap<Integer, Integer> getItems() {
        return items;}
}

