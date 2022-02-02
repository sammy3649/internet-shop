package pro.sky.java.course2.internetshop.service;

import java.util.ArrayList;
import java.util.Map;

public interface BasketService {
    void addToBasket(ArrayList<Integer> idList);

    Map<Integer, Integer> getFromBasket();
}