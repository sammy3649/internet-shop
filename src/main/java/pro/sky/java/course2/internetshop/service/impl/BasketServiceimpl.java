package pro.sky.java.course2.internetshop.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.internetshop.configuration.Basket;
import pro.sky.java.course2.internetshop.service.BasketService;

import java.util.ArrayList;
import java.util.Map;

@Service
public class BasketServiceimpl implements BasketService {
    private final Basket basket;

    public BasketServiceimpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addToBasket(ArrayList<Integer> idList) {
        for (Integer id : idList) {
            basket.addItems(idList);
        }
    }

    @Override
    public Map<Integer, Integer> getFromBasket() {
        return basket.getItems();
    }


}
