package pro.sky.java.course2.internetshop.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.internetshop.service.Basket;
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
            if (basket.getItems().containsKey(id)) {
                basket.getItems().put(id, basket.getItems().get(id)+1);
                basket.getItems().put(id, 1);}
            else {basket.getItems().put(id,1);
            }

        }

    }

    @Override
    public Map<Integer, Integer> getToBasket() {
        return null;
    }

}
