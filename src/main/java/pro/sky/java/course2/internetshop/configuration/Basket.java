package pro.sky.java.course2.internetshop.configuration;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {
    private HashMap<Integer, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }

    public HashMap<Integer, Integer> getItems() {
        return items;
    }

    public void addItems(ArrayList<Integer> idList) {
        for(Integer id : idList){
            items.put(id, id + 1);
    }}
}